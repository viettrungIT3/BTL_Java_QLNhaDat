/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhadat.Models;

import java.util.Date;

public class Transaction {

    protected String idTransaction;
    protected Date dateTransaction;
    protected float unit_price;
    protected float area;
    protected String idUser;

    public Transaction() {
    }

    public Transaction(String idTransaction, Date dateTransaction, float unit_price, float area, String idUser) {
        this.idTransaction = idTransaction;
        this.dateTransaction = dateTransaction;
        this.unit_price = unit_price;
        this.area = area;
        this.idUser = idUser;
    }

    public String getIdTransaction() {
        return idTransaction;
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getIdUser() {
        return idUser;
    }

    public float money() {
        return unit_price * area;
    }
}
