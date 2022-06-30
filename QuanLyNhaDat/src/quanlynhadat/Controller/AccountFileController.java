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
        AccountController accountController = new AccountController();
        List<Account> a2 = accountFile.read();
        for (Account a : a2) {
//            System.out.println(a.toString());
            if (!accountController.checkUsername(a.getUsername())) {
                if (accountController.CreateNewAccount((Account) a)) {
//                    System.out.println("Create new an account success! ");
                }
            } else {
                if (accountController.updateAccount(a)) {
//                    System.out.println("Update account success! ");
                } else {
//                    System.out.println("Update account false! ");
                }
            }
        }
        System.out.println("FILE to SQL success!");
    }

}
