/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author IHAME
 */
public class Citizeners {
    
    private int idN;
    private String fname;
    private String lname;
    private double weight;
    private double height;
    private double bmi;
    private String bmitxt;

    public Citizeners(int idN, String fname, String lname, double weight, double height, double bmi, String bmitxt) {
        this.idN = idN;
        this.fname = fname;
        this.lname = lname;
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
        this.bmitxt = bmitxt;
    }

    public Citizeners() {
    }

    public int getIdN() {
        return idN;
    }

    public void setIdN(int idN) {
        this.idN = idN;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getBmitxt() {
        return bmitxt;
    }

    public void setBmitxt(String bmitxt) {
        this.bmitxt = bmitxt;
    }

    
}
