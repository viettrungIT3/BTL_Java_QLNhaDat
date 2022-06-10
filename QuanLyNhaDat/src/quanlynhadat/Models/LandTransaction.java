/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhadat.Models;

import java.util.Date;

/**
 *
 * @author Trung
 */
public class LandTransaction extends Transaction{
    private String t_type;

    public LandTransaction() {
    }

    public LandTransaction(String t_type) {
        this.t_type = t_type;
    }

    public LandTransaction(int t_id, Date t_date, float t_price, String t_type, float t_area, int id) {
        super(t_id, t_date, t_price, t_area, id);
        this.t_type = t_type;
    }
    
    

    public String getT_type() {
        return t_type;
    }

    public void setT_type(String t_type) {
        this.t_type = t_type;
    }
    
    public float getMoney() {
        return getT_price() * getT_area();
    }
}
