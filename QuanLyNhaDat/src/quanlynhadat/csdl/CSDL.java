package quanlynhadat.csdl;

import java.sql.*;

public class CSDL {
    // SQL Server
//    public static void main(String args[]) {
//        try {
//            // connnect to database 'testdb'
//            Connection conn = Condb();
//            // crate statement
//            Statement stmt = conn.createStatement();
//            // get data from table 'student'
//            ResultSet rs = stmt.executeQuery("select * from nguoi");
//            // show data
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
//                        + "  " + rs.getString(3));
//            }
//            // close connection
//            conn.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//    
//    public static Connection Condb() {
//        final String url = "jdbc:sqlserver://localhost:1433;databaseName=QlNhaDat;encrypt=true;trustServerCertificate=true;user=sa;password=123";
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            System.out.println("Connect database success!");
//            return DriverManager.getConnection(url);
//        } catch (ClassNotFoundException | SQLException ex) {
//            System.out.println("Connect database failure!");
//            System.out.println(ex.getMessage());
//            System.exit(0);
//        }
//        return null;
//    }

    // My SQL with XAMPP
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/btl_java_qlnhadat", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Connect database failure!");
            System.out.println(ex.getMessage());
            System.exit(0);
        }
    }
}

