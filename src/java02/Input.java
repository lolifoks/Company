/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java02;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author azrap
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            // TODO code application logic here
            Employee emp[];
            ObjectInputStream ois = null;
            
            ois = new ObjectInputStream(new FileInputStream("report.txt"));
            emp = (Employee[]) ois.readObject();
            for(Employee e:emp){
                System.out.println(e);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
