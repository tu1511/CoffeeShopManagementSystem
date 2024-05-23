/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Calculate {
    private double tax;
    private double subTotal;

    public double getTax() {
        return calTax(subTotal);
    }

    public double getTotal() {
        return subTotal + getTax();
    }
    
    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    private double calTax(double t) {
        if(t >= 10.0 && t <= 20.0) {
            tax = 0.5;
        } else if(t > 20.0 && t <= 40.0) {
            tax = 1.0;
        } else if(t > 40.0 && t <= 60.0) {
            tax = 2.0;
        } else if(t > 60.0 && t <= 80.0) {
            tax = 3.0;
        } else if(t > 80.0 && t <= 100.0) {
            tax = 4.0;
        } else if(t > 100.0 && t <= 150.0) {
            tax = 8.0;
        } else if(t > 150.0 && t <= 200.0) {
            tax = 10.0;
        } else if(t > 200.0) {
            tax = 15.0;
        } 
        return tax;
    }
}
