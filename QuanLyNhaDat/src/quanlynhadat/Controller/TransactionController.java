package quanlynhadat.Controller;

import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Date;
import quanlynhadat.Connect.ConnectDB;

import quanlynhadat.Models.Transaction;

public class TransactionController {

    public static List<Transaction> getAllTransaction() {
        List<Transaction> list = new ArrayList();
        
        try {
            Connection conn = ConnectDB.getConnection();
            String sqlHome = "SELECT * FROM HOME_TRANSACTIONS";
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlHome);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getFloat("t_area"), rs.getInt("id"));
                    list.add(trs);
                }
            }
            rs = stm.executeQuery(sqlland);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getFloat("t_area"), rs.getInt("id"));
                    list.add(trs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Transaction> getTransactionByUser(String idUser) {
        List<Transaction> list = new ArrayList();

        try {
            Connection conn = ConnectDB.getConnection();
            String sqlHome = "SELECT * FROM HOME_TRANSACTIONS where id='" + idUser + "'";
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS where id='" + idUser + "'";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlHome);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getFloat("t_area"), rs.getInt("id"));
                    list.add(trs);
                }
            }
            rs = stm.executeQuery(sqlland);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getFloat("t_area"), rs.getInt("id"));
                    list.add(trs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Transaction> getAllTransactionByYear(int year) {
        List<Transaction> list = new ArrayList();

        try {
            Connection conn = ConnectDB.getConnection();
            String sqlHome = "SELECT * FROM HOME_TRANSACTIONS where  YEAR(home_date)='" + year + "'";
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS where  YEAR(land_date)='" + year + "'";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlHome);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getFloat("t_area"), rs.getInt("id"));
                    list.add(trs);
                }
            }
            rs = stm.executeQuery(sqlland);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getFloat("t_area"), rs.getInt("id"));
                    list.add(trs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Transaction> getAllTransactionByMonthYear(int year, int month) {
        List<Transaction> list = new ArrayList();

        try {
            Connection conn = ConnectDB.getConnection();
            String sqlHome = "SELECT * FROM HOME_TRANSACTIONS where  YEAR(home_date)='" + year + "' and Month(home_date)='" + month + "'";
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS where  YEAR(land_date)='" + year + "' and Month(land_date)='" + month + "'";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlHome);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getFloat("t_area"), rs.getInt("id"));
                    list.add(trs);
                }
            }
            rs = stm.executeQuery(sqlland);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getFloat("t_area"), rs.getInt("id"));
                    list.add(trs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
