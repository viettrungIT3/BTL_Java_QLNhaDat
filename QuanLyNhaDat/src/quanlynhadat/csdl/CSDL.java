package quanlynhadat.csdl;

import java.sql.*;

public class CSDL {
    
    public static Connection getConnection() {
        final String url = "jdbc:sqlserver://localhost:1433;databaseName=btl_java_quanlynhadat;encrypt=true;trustServerCertificate=true;user=sa;password=123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Connect database success!");
            return DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Connect database failure!");
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        return null;
    }
    
    public static void main(String args[]) {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

//    // My SQL with XAMPP 
//    private static final String DATABASE_NAME = "btl_java_qlnhadat";
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "";
//
//    public static Connection getConnection() {
//        Connection conn = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//        } catch (ClassNotFoundException | SQLException ex) {
//            System.out.println("Connect database failure!");
//            System.out.println(ex.getMessage());
//            System.exit(0);
//        }
//        return conn;
//    }
//
//    public static void main(String[] args) throws SQLException {
//        Connection con = getConnection();
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("select * from users");
//        while (rs.next()) {
//            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//        }
//        con.close();
//    }

}
