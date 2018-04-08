/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexecoes;

import java.util.Scanner;

/**
 *
 * @author edube
 */
public class UsandoThrows {
    
    public static void main(String[] args){
        System.out.println("Entre com um número decimal");
        try {
            double num = leNum();
            System.out.println("Você digitou "+num);
        } catch (Exception e) {
            System.out.println("Entrada inválida ");
            //e.printStackTrace(); inserir stacktrace em log
        }
    }
    
    public static double leNum() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
