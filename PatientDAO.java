
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientDAO {

    public static void savePatient(PatientData patient)
            throws SQLException {

        String patientSQL =
            "INSERT INTO patients "
            + "(patient_type, student_id, first_name, last_name, "
            + "age, sex, course_year, emergency_contact, "
            + "emergency_contact_number, date_registered) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        String visitSQL =
            "INSERT INTO clinic_visits "
            + "(patient_id, visit_date, chief_complaint) "
            + "VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection()) {
            conn.setAutoCommit(false);

            try {
                int patientId;

                try (PreparedStatement ps = conn.prepareStatement(
                        patientSQL,
                        PreparedStatement.RETURN_GENERATED_KEYS)) {

                    ps.setString(1, patient.getType());
                    ps.setString(2, patient.getStudentId());
                    ps.setString(3, patient.getFirstName());
                    ps.setString(4, patient.getLastName());
                    ps.setInt(5, patient.getAge());
                    ps.setString(6, patient.getSex());
                    ps.setString(7, patient.getCourseYear());
                    ps.setString(8, patient.getEmergencyContact());
                    ps.setString(9,
                            patient.getEmergencyContactNumber());
                    ps.setDate(10, java.sql.Date.valueOf(
                            patient.getDate()));

                    ps.executeUpdate();

                    try (ResultSet keys = ps.getGeneratedKeys()) {
                        if (!keys.next()) {
                            throw new SQLException(
                                    "Could not retrieve patient ID.");
                        }
                        patientId = keys.getInt(1);
                    }
                }

                try (PreparedStatement ps =
                        conn.prepareStatement(visitSQL)) {

                    ps.setInt(1, patientId);
                    ps.setDate(2, java.sql.Date.valueOf(
                            patient.getDate()));
                    ps.setString(3, patient.getChiefComplaint());
                    ps.executeUpdate();
                }

                conn.commit();

            } catch (SQLException ex) {
                conn.rollback();
                throw ex;
            } finally {
                conn.setAutoCommit(true);
            }
        }
    }
}
