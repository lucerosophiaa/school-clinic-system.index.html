
public class PatientData {

    private String type;
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String courseYear;
    private String emergencyContact;
    private String emergencyContactNumber;
    private String chiefComplaint;
    private String date;

    public PatientData(String type, String studentId,
            String lastName, String firstName, int age,
            String sex, String courseYear, String emergencyContact,
            String emergencyContactNumber, String chiefComplaint,
            String date) {

        this.type = type;
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.sex = sex;
        this.courseYear = courseYear;
        this.emergencyContact = emergencyContact;
        this.emergencyContactNumber = emergencyContactNumber;
        this.chiefComplaint = chiefComplaint;
        this.date = date;
    }

    public String getType() { return type; }
    public String getStudentId() { return studentId; }
    public String getFirstName() { return firstName; }
    public String getFullName() { return (firstName + " " + lastName).trim(); }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSex() { return sex; }
    public String getCourseYear() { return courseYear; }
    public String getEmergencyContact() { return emergencyContact; }
    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }
    public String getChiefComplaint() { return chiefComplaint; }
    public String getDate() { return date; }
}
