/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlynhadat;

import java.util.List;
import quanlynhadat.Controller.AccountController;
import quanlynhadat.File.AccountFile;
import quanlynhadat.Models.Account;

/**
 *
 * @author Trung
 */
public class QuanLyNhaDat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD

=======
        AccountFile accountFile = new AccountFile();
        List<Account> a2 = List.copyOf(accountFile.read());
        for (Account a : a2) {
            System.out.println(a.toString());
            if ( AccountController.checkLogin(a.getUsername(), a.getPassword()) == null) {
                System.out.println("Create new an account success! " + a.toString());
            }
        }
>>>>>>> 6080c88b247463d17c978ff84d42f28bf2441b80
    }
    
}
