import java.sql.*;
import javax.swing.table.DefaultTableModel;

/** Database queries shared by the clinic dashboard and patient screens. */
public final class ClinicDAO {
    private ClinicDAO() {}

    public static int totalPatients() throws SQLException {
        return scalar("SELECT COUNT(*) FROM patients");
    }
    public static int visitsToday() throws SQLException {
        return scalar("SELECT COUNT(*) FROM clinic_visits WHERE visit_date = CURDATE()");
    }
    public static int lowStockCount() throws SQLException {
        return scalar("SELECT COUNT(*) FROM medicines WHERE quantity <= low_stock_threshold");
    }
    private static int scalar(String sql) throws SQLException {
        try (Connection c=DBConnection.getConnection(); Statement s=c.createStatement(); ResultSet r=s.executeQuery(sql)) {
            return r.next() ? r.getInt(1) : 0;
        }
    }
    public static void fillRecentVisits(DefaultTableModel model) throws SQLException {
        model.setRowCount(0);
        String sql="SELECT p.student_id, CONCAT(p.first_name,' ',p.last_name) AS patient_name, " +
                   "v.chief_complaint, v.visit_date FROM clinic_visits v JOIN patients p ON p.patient_id=v.patient_id " +
                   "ORDER BY v.visit_date DESC, v.visit_id DESC LIMIT 10";
        try (Connection c=DBConnection.getConnection(); PreparedStatement p=c.prepareStatement(sql); ResultSet r=p.executeQuery()) {
            while(r.next()) model.addRow(new Object[]{r.getString("student_id"), r.getString("patient_name"), r.getString("chief_complaint"), r.getDate("visit_date")});
        }
    }
    public static void fillPatientTable(DefaultTableModel model, String search, String type) throws SQLException {
        model.setRowCount(0);
        String sql="SELECT p.patient_id,p.student_id,CONCAT(p.first_name,' ',p.last_name) AS patient_name,p.patient_type, " +
                   "MAX(v.visit_date) AS last_visit,COUNT(v.visit_id) AS visit_count " +
                   "FROM patients p LEFT JOIN clinic_visits v ON p.patient_id=v.patient_id " +
                   "WHERE (?='' OR p.student_id LIKE ? OR p.first_name LIKE ? OR p.last_name LIKE ? OR CONCAT(p.first_name,' ',p.last_name) LIKE ?) " +
                   "AND (?='ALL' OR p.patient_type=?) GROUP BY p.patient_id,p.student_id,p.first_name,p.last_name,p.patient_type " +
                   "ORDER BY last_visit DESC,p.last_name,p.first_name";
        String q=search==null?"":search.trim();
        try(Connection c=DBConnection.getConnection(); PreparedStatement p=c.prepareStatement(sql)) {
            p.setString(1,q); for(int i=2;i<=5;i++) p.setString(i,"%"+q+"%");
            p.setString(6,type==null?"ALL":type); p.setString(7,type==null?"ALL":type);
            try(ResultSet r=p.executeQuery()) { while(r.next()) model.addRow(new Object[]{r.getString("student_id"),r.getString("patient_name"),r.getString("patient_type"),r.getDate("last_visit"),r.getInt("visit_count")}); }
        }
    }
    public static void fillHistory(DefaultTableModel model, String studentId) throws SQLException {
        model.setRowCount(0);
        String sql="SELECT v.visit_date,CONCAT(p.first_name,' ',p.last_name) AS patient_name,v.chief_complaint " +
                   "FROM clinic_visits v JOIN patients p ON p.patient_id=v.patient_id WHERE p.student_id=? ORDER BY v.visit_date DESC,v.visit_id DESC";
        try(Connection c=DBConnection.getConnection(); PreparedStatement p=c.prepareStatement(sql)) {
            p.setString(1,studentId); try(ResultSet r=p.executeQuery()) { while(r.next()) model.addRow(new Object[]{r.getDate("visit_date"),r.getString("patient_name"),r.getString("chief_complaint")}); }
        }
    }
    public static void searchPatient(String query) throws SQLException {
        String sql="SELECT student_id,CONCAT(first_name,' ',last_name) AS patient_name,patient_type,age,sex,course_year,emergency_contact,emergency_contact_number FROM patients WHERE student_id LIKE ? OR first_name LIKE ? OR last_name LIKE ? OR CONCAT(first_name,' ',last_name) LIKE ? ORDER BY last_name,first_name LIMIT 50";
        String q="%"+(query==null?"":query.trim())+"%";
        StringBuilder out=new StringBuilder(); int count=0;
        try(Connection c=DBConnection.getConnection(); PreparedStatement p=c.prepareStatement(sql)) {
            for(int i=1;i<=4;i++) p.setString(i,q);
            try(ResultSet r=p.executeQuery()) { while(r.next()) { count++; out.append("Name: ").append(r.getString("patient_name")).append("\nID: ").append(r.getString("student_id")).append("\nType: ").append(r.getString("patient_type")).append("\nAge: ").append(r.getObject("age")).append("\nSex: ").append(r.getString("sex")).append("\nCourse/Year: ").append(r.getString("course_year")).append("\nEmergency contact: ").append(r.getString("emergency_contact")).append(" ( ").append(r.getString("emergency_contact_number")).append(" )\n\n"); } }
        }
        javax.swing.JOptionPane.showMessageDialog(null,count==0?"No matching patient was found.":out.toString(),"Patient Search",javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
}
