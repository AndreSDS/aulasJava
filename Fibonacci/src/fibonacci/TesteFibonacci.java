/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author edube
 */
public class TesteFibonacci {
    public static void main(String[] args) {
        System.out.println("Exemplo fibonacci");
        for (int i = 1; i < 10; i++) {
        System.out.print(Fibonacci.fibonacci(i)+" ");
        }
        System.out.println("");
        
        System.out.println("Exemplo somatorio");
        System.out.println(Fibonacci.somatorio(5));
    }
}
