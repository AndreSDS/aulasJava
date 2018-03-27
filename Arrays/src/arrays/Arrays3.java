/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author edube
 */
public class Arrays3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int impar[] = new int[matriz.length];
        int par[] = new int[matriz.length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição "+i+" "+j+" = ");
                matriz[i][j] = scan.nextInt();
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        int qtdImpar = 0;
        int qtdPar = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                  qtdImpar++;
                }else{
                  qtdPar++;
                }
            }
        }
        System.out.println("Quantidade de números ímpares é "+qtdImpar);
        System.out.println("Quantidade de números pares é "+qtdPar);
    }
}
