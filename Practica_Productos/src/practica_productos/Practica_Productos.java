/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_productos;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Isra
 */
public class Practica_Productos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //GUI.main(args);
        Random rand = new Random();
        Date d = new Date();
        
        Date d2 = new Date();
        d.setTime(rand.longs(0,d2.getTime()).findFirst().getAsLong());
        System.out.println(d.toString());
        System.out.println(String.valueOf(d2.toString()));
        
    }
    
}
