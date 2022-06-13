/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhadat.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import quanlynhadat.File.AccountFile;
import quanlynhadat.Models.Account;
import static quanlynhadat.Connect.ConnectDB.getConnection;

/**
 *
 * @author Trung
 */
public class AccountFileController {

    public static void SqlToFile() {
        List<Account> accountList = List.copyOf(AccountController.getAllAccount());
        AccountFile accountFile = new AccountFile();
        accountFile.write(accountList);
        System.out.println("SQL to FILE success!");
    }

//    public static void main(String[] args) {
    public static void FileToSql() {
        AccountFile accountFile = new AccountFile();
        try {
            String sql = "DELETE FROM USERS; DBCC CHECKIDENT ('[USERS]', RESEED, 0);";
            Connection conn = getConnection();
            PreparedStatement p = conn.prepareStatement(sql);
            p.execute();
            p.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("FILE to SQL false by DELETE!" + e.getMessage());
        }
        List<Account> a2 = accountFile.read();
        List<Account> accountList = List.copyOf(AccountController.getAllAccount());
        for (Account a : a2) {
//            System.out.println(a.toString());
            if ( AccountController.checkLogin(a.getUsername(), a.getPassword()) == null) {
                AccountController.CreateNewAccount((Account) a);
                System.out.println("Create new an account success! " + a.toString());
            }
        }
        System.out.println("FILE to SQL success!");
    }

}
