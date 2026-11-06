/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ap Ril
 */
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.List;

public class NurseStore {

    private static final Path FILE = Paths.get("nurses.txt");

    // name of the nurse who is currently logged in
    public static String currentNurse = "";

    static {
        // first run: create a default account so you can still log in
        if (!Files.exists(FILE)) {
            register("Admin", "admin123@gmail.com", "admin123");
        }
    }

    // returns null if OK, or an error message
    public static String register(String name, String email, String password) {
        name = name.trim();
        email = email.trim().toLowerCase();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            return "Fill in all fields.";
        }
        if (!email.matches("^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$")) {
            return "Enter a valid email address.";
        }
        if (password.length() < 6) {
            return "Use a password with at least 6 characters.";
        }
        if (find(email) != null) {
            return "That email is already registered.";
        }

        String salt = newSalt();
        String line = email + "\t" + name.replace("\t", " ") + "\t" + salt + "\t" + hash(password, salt);
        try {
            Files.write(FILE, List.of(line), StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            return "Couldn't save the account. Try again.";
        }
        return null;
    }

    // returns the nurse's name if the login is correct, otherwise null
    public static String login(String email, String password) {
        String[] p = find(email);
        if (p == null) {
            return null;
        }
        return hash(password, p[2]).equals(p[3]) ? p[1] : null;
    }

    private static String[] find(String email) {
        try {
            if (!Files.exists(FILE)) {
                return null;
            }
            for (String line : Files.readAllLines(FILE, StandardCharsets.UTF_8)) {
                String[] p = line.split("\t");
                if (p.length == 4 && p[0].equals(email.trim().toLowerCase())) {
                    return p;
                }
            }
        } catch (IOException e) {
            // ignore, treated as not found
        }
        return null;
    }

    private static String newSalt() {
        byte[] b = new byte[8];
        new SecureRandom().nextBytes(b);
        return toHex(b);
    }

    private static String hash(String password, String salt) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            return toHex(md.digest((salt + password).getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String toHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}

