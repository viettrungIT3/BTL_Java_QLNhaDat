/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhadat.Controller;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import quanlynhadat.Models.Account;
import quanlynhadat.Connect.ConnectDB;
import static quanlynhadat.Connect.ConnectDB.getConnection;

/**
 *
 * @author Trung
 */
public class AccountController {

    public AccountController() {
    }

    public static List<Account> getAllAccount() {
        List<Account> accounts = new ArrayList<>();
        String sql = "select * from USERS ";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet p = stmt.executeQuery(sql);
            while (p.next()) {
                Account acc = new Account(
                        p.getInt(1),
                        p.getString(2),
                        p.getString(3),
                        p.getString(4),
                        p.getInt(5),
                        p.getBoolean(6)
                );

                accounts.add(acc);
            }
        } catch (SQLException e) {
            System.out.println("Error get all account: " + e.getMessage());
        }
        return accounts;
    }
    
    public static List<Account> getAccountsLikeUsername(String name) {
        List<Account> accounts = new ArrayList<>();
        String sql = "select * from USERS where status_u = 1";
        //String sql = "select * from USERS where username LIKE N'%" + name + "%'";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet p = stmt.executeQuery(sql);
            while (p.next()) {
                Account acc = new Account(
                        p.getInt(1),
                        p.getString(2),
                        p.getString(3),
                        p.getString(4),
                        p.getInt(5),
                        p.getBoolean(6)//kim
                );

                accounts.add(acc);
            }
        } catch (SQLException e) {
            System.out.println("Error get all account: " + e.getMessage());
        }
        return accounts;
    }

    public static Account getAccountByID(int id) {
        Account acc = null;
        String sql = "select * from USERS where id = '" + id + "'";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet p = stmt.executeQuery(sql);
            if (p.next()) {
                acc = new Account(
                        p.getInt(1),
                        p.getString(2),
                        p.getString(3),
                        p.getString(4),
                        p.getInt(5),
                        p.getBoolean(6)//kim
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return acc;
    }

    public static Account checkLogin(String username, String password) {
        Account acc = null;
        String sql = "select * from USERS where username = '" + username + "' and password_u = '" + password + "'";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet p = stmt.executeQuery(sql);
            if (p.next()) {
                acc = new Account(
                        p.getInt(1),
                        p.getString(2),
                        p.getString(3),
                        p.getString(4),
                        p.getInt(5),
                        p.getBoolean(6)//kim
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return acc;
    }

    public static boolean checkUsername(String username) {
        Account acc = null;
        String sql = "select * from USERS where username = '" + username + "'";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet p = stmt.executeQuery(sql);
            if (p.next()) {
                acc = new Account(
                        p.getInt(1),
                        p.getString(2),
                        p.getString(3),
                        p.getString(4),
                        p.getInt(5),
                        p.getBoolean(6)
                );
            }
            if (acc == null) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean CreateNewAccount(Account account) {
        String sql = "INSERT INTO USERS ( fullname, username, password_u, role_id,status_u) VALUES (?,?,?,?,?)";
        try {
            Connection conn = getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1, account.getFullname());
            p.setString(2, account.getUsername());
            p.setString(3, account.getPassword());
            p.setInt(4, account.getRole_id());
            p.setBoolean(5,true);
            p.executeUpdate();
            p.close();
            conn.close();
            System.out.println("Create new account success!");
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean updateAccount(Account account) {
        String sql = "UPDATE USERS SET fullname = ?, username = ?, password_u = ?  WHERE id = ?";
        try {

            Connection conn = ConnectDB.getConnection();
            PreparedStatement p = conn.prepareStatement(sql);

            p.setString(1, account.getFullname());
            p.setString(2, account.getUsername());
            p.setString(3, account.getPassword());
            p.setInt(4, account.getId());
            p.execute();
            p.close();
            conn.close();
            System.out.println("Update account success!");
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static boolean deleteAccount(Integer accountId, boolean status) {
        String sqlDeleteUser = "UPDATE USERS SET status_u = ? WHERE id = ?";
        try {

            Connection conn = ConnectDB.getConnection();
            PreparedStatement p = conn.prepareStatement(sqlDeleteUser);

            p.setBoolean(1, status);
            p.setInt(2, accountId);

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
