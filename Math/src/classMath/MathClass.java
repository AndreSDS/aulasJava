/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classMath;

import java.util.Date;

/**
 *
 * @author edube
 */
public class MathClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println(Math.pow(2, 3));
        
        System.out.println(Math.round(4.7));
        
        System.out.println(Math.round(4.4));
        
        System.out.println(Math.ceil(5.4));
        
        System.out.println(Math.floor(4.5));
        
        System.out.println(Math.round(Math.random() * 10));
        
        System.out.println(Math.sin(Math.toRadians(30)));
        
        System.out.println(Math.cos(Math.toRadians(1)));
        
        System.out.println(Math.tan(Math.toRadians(45)));
        
        Date data = new Date();
        System.out.println(data);
        
        System.out.println("Milissegundos desde 1970 "+data.getTime());
        
        System.out.println(data.getDate());
        
        
    }
    
}
