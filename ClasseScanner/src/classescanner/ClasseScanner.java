/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classescanner;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author edube
 */
public class ClasseScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner scan = new Scanner(System.in);
        
        double[][] notasAlunos;
        notasAlunos = new double[3][4];//primeiro colchetes são as linhas
        
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;
        
        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;
        
        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;
        
        for (int i = 0; i < notasAlunos.length; i++) {
           for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Calculando a média de cada aluno");
        
        double soma;
        for (int i = 0; i < notasAlunos.length; i++) {
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
              soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno "+i+" é = "+(soma/4));
        }
        System.out.println("");
        System.out.println("Matriz 3x3x3");
        
        int[][][] matrizTri = new int[3][3][3];
        
        for (int i = 0; i < matrizTri.length; i++) {
            for (int j = 0; j < matrizTri[i].length; j++) {
                for (int k = 0; k < matrizTri[i][j].length; k++) {
                  matrizTri[i][j][k] = i + j + k;
                }
            }
        }
        
        int soma2 = 0;
        int somaImpar = 0;
        int somaPar = 0;
        for (int i = 0; i < matrizTri.length; i++) {
            for (int j = 0; j < matrizTri[i].length; j++) {
                for (int k = 0; k < matrizTri[i][j].length; k++) {
                  soma2 += matrizTri[i][j][k] = i + j + k;
                  
                    if (matrizTri[i][j][k] % 2 == 0) {
                        somaPar += matrizTri[i][j][k];
                    }else{
                        somaImpar += matrizTri[i][j][k];
                    }
                }
            }
        }
        System.out.println("Soma total = " + soma2);
        System.out.println("Soma de ímpares = "+somaImpar);
        System.out.println("Soma de pares = "+somaPar);
        
        System.out.println("");
        System.out.println("Matriz Irregular");
        
        System.out.println("Digite o número de pessoas ");
        int numPessoas = scan.nextInt();
        
        String[][] nomeFilhos = new String[numPessoas][];
        
        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Digite número de filhos");
            
            int qtdFilhos = scan.nextInt();
            
            nomeFilhos[i] = new String[qtdFilhos];
            
            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho "+(j+1));
                
                nomeFilhos[i][j] = scan.next();
            }
        }
        
        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Pessoa "+i+" tem "+Arrays.toString(nomeFilhos[i])+" filhos");
            for (String nomeFilho : nomeFilhos[i]) {
                System.out.println(nomeFilho);
            }
        }
    }
    }
