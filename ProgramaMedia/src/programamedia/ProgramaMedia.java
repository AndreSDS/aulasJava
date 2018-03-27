/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author edube
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média é; "+m);
        if (m>9) {
            System.out.println("Prabéns!");
        }
        Scanner tec;
        tec = new Scanner(System.in);
        System.out.print("Digite o anor de seu nascimento: ");
        int nasc = tec.nextInt();
        System.out.println("Seu ano de nascimento é: "+nasc);
        int idade = 2018 - nasc;
        System.out.println("Sua idade é :"+idade);
        if (idade>=18) {
            System.out.println("Maior de idade!");
        }else{
            System.out.println("Menor de idade");
        }
    }
    
}
