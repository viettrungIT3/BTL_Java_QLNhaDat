/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhadat.Controller;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import quanlynhadat.Models.Account;
import static quanlynhadat.csdl.CSDL.getConnection;

/**
 *
 * @author Trung
 */
public class AccountController {

    public static List<Account> getAllAccount() {
        List<Account> accounts = new ArrayList<>();
        String sql = "select * from users";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Account acc = new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5)
                );

                accounts.add(acc);
            }
        } catch (SQLException e) {
            System.out.println("Error get all account: " + e.getMessage());
        }
        return accounts;
    }

    public static Account checkLogin(String username, String password) {
        Account acc = null;
        String sql = "select * from users where username = '" + username + "' and password = '" + password + "'";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                acc = new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5)
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return acc;
    }
}
