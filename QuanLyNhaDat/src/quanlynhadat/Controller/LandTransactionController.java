/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhadat.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import quanlynhadat.Connect.ConnectDB;
import static quanlynhadat.Connect.ConnectDB.getConnection;
import quanlynhadat.Models.Transaction;

public class LandTransactionController {

    // Lấy toàn bộ danh sách giao dịch
    public static List<Transaction> getAllTransaction() {
        List<Transaction> list = new ArrayList();

        try {
            Connection conn = ConnectDB.getConnection();
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS ORDER BY FORMAT(t_date, 'yyyy/MM/dd') DESC, t_id, t_type, t_price";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlland);
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

    // Lấy toàn bộ danh sách giao dịch theo idUser
    public static List<Transaction> getAllTransactionByUser(int idUser) {
        List<Transaction> list = new ArrayList();

        try {
            Connection conn = ConnectDB.getConnection();
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS where id='" + idUser + "' ORDER BY FORMAT(t_date, 'yyyy/MM/dd') DESC, t_id, t_type, t_price";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlland);
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

    public static Transaction getTransactionByUser(int idUser, String t_id) {
        Transaction trs = null;

        try {
            Connection conn = ConnectDB.getConnection();
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS WHERE id='" + idUser + "' AND  t_id = '" + t_id + "'";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sqlland);
            while (rs.next()) {
                Date day = rs.getDate("t_date");
                Date myday = null;
                if (day != null) {
                    myday = new Date(day.getTime());
                    trs = new Transaction(rs.getInt("t_id"), myday, rs.getFloat("t_price"), rs.getString("t_type"), rs.getFloat("t_area"), rs.getInt("id"), 2);
                    return trs;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean CreateNewTransaction(Transaction trs) {
        String sql = "INSERT INTO LAND_TRANSACTIONS (t_date, t_price, t_type, t_area, id) VALUES( ? , ? , ? , ?, ?)";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Connection conn = getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, sdf.format(trs.getT_date()));
            p.setString(2, trs.getT_price() + "");
            p.setString(3, trs.getT_type());
            p.setString(4, trs.getT_area() + "");
            p.setInt(5, trs.getId());
            if (p.executeUpdate() > 0) {
                return true;
            }
            p.execute();
            p.close();
            conn.close();
            System.out.println("Create new Land Transaction success!");
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean updateTransaction(Transaction trs) {
        String sql = "UPDATE LAND_TRANSACTIONS SET t_date = ?, t_price = ?, t_type = ?, t_area = ?  WHERE t_id = ?";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);

            p.setString(1, sdf.format(trs.getT_date()));
            p.setString(2, trs.getT_price() + "");
            p.setString(3, trs.getT_type());
            p.setString(4, trs.getT_area() + "");
            p.setInt(5, trs.getT_id());

            p.execute();
            p.close();
            conn.close();
            System.out.println("Update LandTransaction success!");
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean deleteTransaction(int idUser, String t_id) {
        String sqlDeleteUser = "DELETE FROM LAND_TRANSACTIONS WHERE id='" + idUser + "' AND  t_id = '" + t_id + "'";
        try {

            Connection conn = ConnectDB.getConnection();
            PreparedStatement p = conn.prepareStatement(sqlDeleteUser);

            p.execute();
            p.close();
            conn.close();
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
