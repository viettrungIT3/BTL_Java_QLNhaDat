/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhadat.Models;

import java.io.Serializable;

/**
 *
 * @author Trung
 */
public class Account implements Serializable{
     private int id;
    private String fullname;
    private String username;
    private String password;
    private int role_id;
    private boolean status;

    public Account() {
    }

    public Account(String fullname, String username, String password, int role_id,boolean status) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.role_id = role_id;
        this.status=status;
    }
    
    //kim

    public Account(int id, String fullname, String username, String password, int role_id,boolean status) {
        this.id = id;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.role_id = role_id;
        this.status=status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

   public String getStatus() {
      if( status==true )
      {
            return "Ðang hoạt động";
       }
      else return "Đã nghỉ làm";
     
   }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", fullname=" + fullname + ", username=" + username + ", password=" + password + ", role_id=" + role_id + '}';
    }

}
