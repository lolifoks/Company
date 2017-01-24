/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java02;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
/**
 *
 * @author azrap
 */
public class Output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(ir);
        ObjectOutputStream oos = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = in.nextInt();
        Employee emp[] = new Employee[n];
        
        char c = ' ';
        for(int i=0; i<n; i++){
            
        System.out.println("Enter w for worker and b for boss: ");
        c = (char)br.read();
            switch (c) {
                case 'w':
                case 'W':
                    System.out.println("Enter the new worker: ");
                    Employee ee = new Employee();
                    
                    System.out.println("Name: ");
                    ee.setName(in.next());
                    in.nextLine();
                    System.out.println("Hours: ");
                    ee.setHours(in.nextInt());
                    in.nextLine();
                    System.out.println("Price: ");
                    ee.setPrice(in.nextDouble());
                    in.nextLine();
                    emp[i] = ee;
                    break;
                case 'b':
                case 'B':
                    System.out.println("Enter the new boss: ");
                    Employer e = new Employer();
                    
                    System.out.println("Name: ");
                    e.setName(in.next());
                    in.nextLine();
                    System.out.println("Hours: ");
                    e.setHours(in.nextInt());
                    in.nextLine();
                    System.out.println("Price: ");
                    e.setPrice(in.nextDouble());
                    in.nextLine();
                    System.out.println("Tip: ");
                    e.setTip(in.nextDouble());
                    in.nextLine();
                    emp[i] = e;
                    break;
                
            }
            
            try{
            
            oos = new ObjectOutputStream(new FileOutputStream("report.txt"));
            oos.writeObject(Arrays.toString(emp));
            }
            catch(IOException ex){
            
                System.out.println("Error! "+ex.toString());
            }
            
            finally{
            
            try{
            oos.close();
            }
            catch(IOException ex){
            
                System.out.println("Error when closing file! "+ex.toString());
            }
            }
        
        
        
    }
    
}}
