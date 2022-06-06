/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhadat.File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import quanlynhadat.Models.Account;

/**
 *
 * @author Trung
 */
public class AccountFile {
    private static final String FILE_NAME ="ACCOUNT.txt";
    
    public void write(List<Account> accountList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(FILE_NAME));
            oos = new ObjectOutputStream(fos);

            System.out.println(accountList.size());
            for (Account a : accountList) {
                oos.writeObject(a);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    
    public List<Account> read() {
        List<Account> accountList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(FILE_NAME));
            ois = new ObjectInputStream(fis);

            while(fis.available() > 0){
                Account a = (Account) ois.readObject();
                accountList.add(a);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException | ClassNotFoundException e) {
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return accountList;
    }
    
    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
            }
        }
    }
    
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
            }
        }
    }
}
