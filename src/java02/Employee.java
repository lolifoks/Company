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
public class Employee implements Serializable {
    
     private String name;
     private int hours;
     private double price;
     
    public Employee(){};

    public Employee(String name, int hours, double price) {
        this.name = name;
        this.hours = hours;
        this.price = price;
    }

    
    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double Salary(){
    
        return this.hours*this.price;
    }
    
     @Override
     public String toString() {
        return "Name: "+this.name + "  Salary: "+String.format("%1.2f", this.Salary()+"\n");
    }
    
  
    
}
