/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas;

import java.util.Scanner;

/**
 *
 * @author edube
 */
public class Tokens {
    public static void main(String[] args) {
        String nome = "André, Pedro, Paulo, Alex, Daniel, Eduardo, Bernardo";
        
        String[] nomes = nome.split(" ");
        for (String n : nomes) {
            System.out.println(n.trim());
        }
        
        Scanner scan = new Scanner("1 true 100 oi");
        while (scan.hasNext()) {            
            System.out.println(scan.next());
        }
        
        Scanner scan2 = new Scanner("1 true 100 oi");
        while (scan2.hasNext()) {            
            if (scan2.hasNextInt()) {
                int i = scan2.nextInt();
                System.out.println(i);
            }else if (scan2.hasNextBoolean()) {
                boolean b = scan2.nextBoolean();
                System.out.println(b);
            }
        }
        
    }   
}
