/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhadat.Models;

import java.util.Date;

public class Transaction {

    protected int t_id;
    protected Date t_date;
    protected float t_price;
    protected String t_type;
    protected float t_area;
    protected int id;
    protected int type;

    public Transaction() {
    }

    public Transaction(int t_id, Date t_date, float t_price, String t_type, float t_area, int id, int type) {
        this.t_id = t_id;
        this.t_date = t_date;
        this.t_price = t_price;
        this.t_type = t_type;
        this.t_area = t_area;
        this.id = id;
        this.type = type;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public Date getT_date() {
        return t_date;
    }

    public void setT_date(Date t_date) {
        this.t_date = t_date;
    }

    public float getT_price() {
        return t_price;
    }

    public void setT_price(float t_price) {
        this.t_price = t_price;
    }

    public float getT_area() {
        return t_area;
    }

    public void setT_area(float t_area) {
        this.t_area = t_area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getT_type() {
        return t_type;
    }

    public int getType() {
        return type;
    }
    
    
    public float getMoney() {
        return getT_price() * getT_area();
    }
}
