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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        
        Random numeroRandom = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numeroRandom.nextInt(9);
            }
        }
        
        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int col = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                  maior = matriz[i][j];
                  linha = i;
                  col = j;
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Maior valor = "+maior);
        System.out.println("Linha = "+linha);
        System.out.println("Coluna = "+col);
        
    }
    
}
