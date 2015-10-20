/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializacion1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class Serializacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("serial.txt"));
            ObjectInputStream oi = new ObjectInputStream(new FileInputStream("serial.txt"));
            
            MClase mclase1= new MClase( "ola",-7, 2.7E10);
            os.writeObject(mclase1);
            os.close();
            
            MClase mclase2= (MClase) oi.readObject();
            System.out.println(mclase2.toString());
            
            oi.close();
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializacion1.class.getName()).log(Level.SEVERE, null, ex);
       
        } catch (IOException ex) {
            Logger.getLogger(Serializacion1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializacion1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
}
