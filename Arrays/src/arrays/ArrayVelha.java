package arrays;

import java.util.Scanner;

/**
 *
 * @author edube
 */
public class ArrayVelha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            if (jogada % 2 == 1) {
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1 - 3)");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1 - 3)");
                sinal = 'O';
            }

            boolean linhaVal = false;
            while (!linhaVal) {
                System.out.println("Entre com a linha (1,2,3)");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaVal = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente.");
                }
            }

            boolean colVal = false;
            while (!colVal) {
                System.out.println("Entre com a coluna (1,2,3)");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colVal = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente.");
                }
            }
            linha--;
            coluna--;
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                System.out.println("Posição já usada, tente outra.");
            } else {
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            for (int i = 0; i < jogoVelha.length; i++) {
                for (int j = 0; j < jogoVelha[i].length; j++) {
                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println("");
            }

            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')//linha 1
                    || (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')//linh 2
                    || (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')//linha 3
                    || (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')//col 1
                    || (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')//col 2
                    || (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X')//col 3
                    || (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')//diagonal direita
                    || (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')/*diagonal esquerda*/) {

                ganhou = true;
                System.out.println("Jogador 1 Venceu!");

            } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')//linha 1
                    || (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')//linh 2
                    || (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')//linha 3
                    || (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')//col 1
                    || (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')//col 2
                    || (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O')//col 3
                    || (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')//diagonal direita
                    || (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')/*diagonal esquerda*/) {

                ganhou = true;
                System.out.println("Jogador 2 venceu!");
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Ninguém venceu!");
            }
        }
    }
}
