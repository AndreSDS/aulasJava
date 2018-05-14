/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edube
 */
public class TesteMinhaCalculadora {
    public static void main(String[] args) {
        
        MinhaCalculadora calculadora = new MinhaCalculadora();
        
        int soma1 = calculadora.soma(1, 2);
        System.out.println(soma1);
        
        int soma2 = calculadora.soma(1, 2, 4);
        System.out.println(soma2);
        
        int soma3 = MinhaCalculadora.soma(3, 3);
        System.out.println(soma3);
    }
}
