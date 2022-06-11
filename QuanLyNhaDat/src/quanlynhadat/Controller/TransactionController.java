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
            String sqlHome = "SELECT * FROM HOME_TRANSACTIONS ORDER BY FORMAT(t_date, 'yyyy/MM/dd') DESC, t_id, t_type, t_price";
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS ORDER BY FORMAT(t_date, 'yyyy/MM/dd') DESC, t_id, t_type, t_price";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlHome);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getString("t_type"), rs.getFloat("t_area"), rs.getInt("id"), 1);
                    list.add(trs);
                }
            }
            rs = stm.executeQuery(sqlland);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getString("t_type"), rs.getFloat("t_area"), rs.getInt("id"), 2);
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
            String sqlHome = "SELECT * FROM HOME_TRANSACTIONS where id='" + idUser + "' ORDER BY FORMAT(t_date, 'yyyy/MM/dd') DESC, t_id, t_type, t_price";
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS where id='" + idUser + "' ORDER BY FORMAT(t_date, 'yyyy/MM/dd') DESC, t_id, t_type, t_price";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlHome);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getString("t_type"), rs.getFloat("t_area"), rs.getInt("id"), 1);
                    list.add(trs);
                }
            }
            rs = stm.executeQuery(sqlland);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getString("t_type"), rs.getFloat("t_area"), rs.getInt("id"), 2);
                    list.add(trs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Transaction> getAllTransactionByYear(String year) {
        List<Transaction> list = new ArrayList();

        try {
            Connection conn = ConnectDB.getConnection();
            String sqlHome = "SELECT * FROM HOME_TRANSACTIONS where  YEAR(t_date)='" + year + "' ORDER BY FORMAT(t_date, 'yyyy/MM/dd') DESC, t_id, t_type, t_price";
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS where  YEAR(t_date)='" + year + "' ORDER BY FORMAT(t_date, 'yyyy/MM/dd') DESC, t_id, t_type, t_price";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlHome);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getString("t_type"), rs.getFloat("t_area"), rs.getInt("id"), 1);
                    list.add(trs);
                }
            }
            rs = stm.executeQuery(sqlland);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getString("t_type"), rs.getFloat("t_area"), rs.getInt("id"), 2);
                    list.add(trs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Transaction> getAllTransactionByMonthYear(String year, String month) {
        List<Transaction> list = new ArrayList();

        try {
            Connection conn = ConnectDB.getConnection();
            String sqlHome = "SELECT * FROM HOME_TRANSACTIONS where  YEAR(t_date)='" + year + "' and Month(t_date)='" + month + "'ORDER BY FORMAT(t_date, 'yyyy/MM/dd') DESC, t_id, t_type, t_price";
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS where  YEAR(t_date)='" + year + "' and Month(t_date)='" + month + "'ORDER BY FORMAT(t_date, 'yyyy/MM/dd') DESC, t_id, t_type, t_price";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlHome);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getString("t_type"), rs.getFloat("t_area"), rs.getInt("id"), 1);
                    list.add(trs);
                }
            }
            rs = stm.executeQuery(sqlland);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    Transaction trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getString("t_type"), rs.getFloat("t_area"), rs.getInt("id"), 2);
                    list.add(trs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
