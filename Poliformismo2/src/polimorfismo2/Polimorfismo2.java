/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo2;

/**
 *
 * @author edube
 */
public class Polimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");
        c.reagir(3, 9.4f);
        c.reagir(true);
        c.reagir(13, 30);
    }
    
}
