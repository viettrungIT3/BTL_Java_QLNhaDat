package quanlynhadat.Connect;

import java.sql.*;

public class ConnectDB {
    
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
    

}
