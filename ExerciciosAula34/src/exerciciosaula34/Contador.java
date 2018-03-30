/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosaula34;

/**
 *
 * @author edube
 */
public class Contador {
    
    private static int contador;

    public Contador() {
        contador++;
    }
    

    public static void incrementar(){
        contador++;
    }
    
    public static void zerar(){
        contador = 0;
    }

    public static int getContador() {
        return contador;
    }
    
    public static void imprimirValor(){
        System.out.println(Contador.getContador());
    }

}

