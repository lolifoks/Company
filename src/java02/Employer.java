/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java02;
import java.io.*;
/**
 *
 * @author azrap
 */
public class Employer extends Employee {
    
    private double tip;
    
    public Employer(){}
    public Employer(String name, int hours, double price, double tip) {
        super(name, hours, price);
        this.tip = tip;
    }

   

   
    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }
    
    public double Salary(){
    
        return super.Salary()+this.tip;
    }
    
   
    
}
