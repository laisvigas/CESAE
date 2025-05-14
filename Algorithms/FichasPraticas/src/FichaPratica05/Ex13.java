package FichaPratica05;

import java.util.Scanner;

// Escreva um programa que lê uma matriz de tamanho 4x4
// e encontra a soma dos elementos da diagonal principal.

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        // ler valores para matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira um número na matriz ["+ linha +"]["+ coluna +"]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        int soma = 0;

        // soma da diagonal
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }

        System.out.println("Soma: " + soma);
    }
}
