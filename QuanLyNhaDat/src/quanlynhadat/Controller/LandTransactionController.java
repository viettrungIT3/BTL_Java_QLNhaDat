/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhadat.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import quanlynhadat.Connect.ConnectDB;
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
    
    public static Transaction getTransactionByUser(int idUser, int t_id) {
        Transaction trs = null;

        try {
            Connection conn = ConnectDB.getConnection();
            String sqlland = "SELECT * FROM LAND_TRANSACTIONS where id='" + idUser + "' AND  t_id = '" + t_id + "'";
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
}
