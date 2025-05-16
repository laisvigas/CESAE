package FichaPratica06;

// Implemente funções que, dadas 2 matrizes de inteiros com a mesma dimensão,
// apresente (numa função) em forma de matriz o resultado da soma das 2 matrizes
// e (noutra função) o somatório dos seus elementos.

import java.util.Scanner;

public class Ex08 {
    static void somarMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2){

        int [][] somaMatrizes = new int[3][3];

        for(int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                somaMatrizes[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }

        for(int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                System.out.print(somaMatrizes[linha][coluna] + "  |  ");
            }
            System.out.println(" ");
        }
    }

    static int somatorioMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2) {
        int somatorioMatrizes = 0;
        int [][] somaMatrizes = new int[3][3];

        for(int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                somaMatrizes[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }

        for(int linha = 0; linha < somaMatrizes.length; linha++) {
            for (int coluna = 0; coluna < somaMatrizes[0].length; coluna++) {
                somatorioMatrizes += somaMatrizes[linha][coluna];
            }
        }

        return somatorioMatrizes;
    }
}
