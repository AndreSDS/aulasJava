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
public class Fibonacci {
    
    //fibonacci    
    public static int fibonacci(int num){
        if (num < 2) {
            return 1;
        }
        return fibonacci(num -1) + fibonacci(num -2);
    }
    
    //somatorio
    public static int somatorio(int num){
        if (num == 1) {
            return 1;
        }
        return num + somatorio(num -1);
    }
}
