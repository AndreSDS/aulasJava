/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;

/**
 *
 * @author edube
 */
public class Arrays2 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[10][10];
        
        Random numeroRandom = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numeroRandom.nextInt(9);
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Linha "+i+" = ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        int maiorL5 = 0;
        int menorL5 = Integer.MAX_VALUE;
        int linha5 = 5;
        for (int i = 0; i < matriz[5].length; i++) {
            if (matriz[linha5][i] > maiorL5) {
                maiorL5 = matriz[linha5][i];
            }
            if (matriz[linha5][i] < menorL5) {
                menorL5 = matriz[linha5][i];
            }
        }
        
        System.out.println("Maior valor linha 5 = "+maiorL5);
        System.out.println("Menor valor linha 5 = "+menorL5);

        int maiorc7 = 0;
        int menorc7 = Integer.MAX_VALUE;
        int col7 = 7;
        
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][col7] > maiorc7) {
                maiorc7 = matriz[i][col7];
            }
            if (matriz[i][col7] < menorc7) {
                menorc7 = matriz[i][col7];
            }
        }
        
        System.out.println("Maior valor da coluna 7 = "+maiorc7);
        System.out.println("Menor valor da coluna 7 ="+menorc7);
    }
}
