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
public class ExerciciosAula34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contador.imprimirValor();
        
        Contador.incrementar();
          Contador.imprimirValor();
        
        Contador.zerar();
          Contador.imprimirValor();
        
        Contador.incrementar();
          Contador.incrementar();
           Contador.incrementar();
        Contador.imprimirValor();
        
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
         Contador.imprimirValor();
         
         System.out.println("");
         
        System.out.println(Calculadora.soma(1, 3));
        System.out.println(Calculadora.subtrair(6, 3));
        System.out.println(Calculadora.dividir(9, 3));
        System.out.println(Calculadora.multiplicar(1, 3));
        System.out.println(Calculadora.potencia(2, 3));
        System.out.println(Calculadora.fatorialRecursivo(5));
    }
    
}
