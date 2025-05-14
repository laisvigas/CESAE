package FichaPratica05;

// todo
// 12. Escreva um programa que lê dois arrays de tamanho 10
// e gera uma matriz 10x2 com os elementos da primeira junto aos elementos da segunda.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[][] matriz = new int[10][2];

        // Ler valores para vetor 1
        for(int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira os valores do vetor 1: " );
            vetor1[i] = input.nextInt();
        }

        // Ler valores para vetor 2
        for(int i = 0; i < vetor2.length; i++) {
            System.out.print("Insira os valores do vetor 2: " );
            vetor2[i] = input.nextInt();
        }

        // colocar vetores em matriz
//        for(int linha = 0; linha < matriz.length; linha++) {
//            for(int coluna = 0; coluna < matriz[0].length; coluna++) {
//                matriz[linha][coluna] = vetor1[linha];
//            }
//        }
//
//        for(int linha = 0; linha < matriz.length; linha++) {
//            for(int coluna = 1; coluna < matriz[0].length; coluna++) {
//                matriz[linha][coluna] = vetor2[linha];
//            }
//        }

        // colocar vetores em matriz
        for(int i = 0; i < vetor1.length; i++) {
            matriz[i][0]=vetor1[i];
            matriz[i][1]=vetor2[i];
        }


        // imprimir matriz
        for(int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "  |  ");
            }
            System.out.println(" ");
        }
    }
}
