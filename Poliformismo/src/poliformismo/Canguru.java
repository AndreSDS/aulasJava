/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformismo;

/**
 *
 * @author edube
 */
public class Canguru extends Mamifero{
    //métodos
    public void usarBolsa(){
        System.out.println("Usando bolsa!");
    }
    @Override
    public void locomover(){
        System.out.println("Saltando!"); 
    }
}
