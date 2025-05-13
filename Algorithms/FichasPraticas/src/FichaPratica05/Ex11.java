package FichaPratica05;

// Faça um programa que preencha cada posição de uma matriz (3x3 elementos inteiros)
// com um valor introduzido pelo utilizador.
// Deverá indicar qual o maior e qual o menor dos valores guardados na matriz,
// e deverá imprimir todo conteúdo da matriz de forma semelhante ao exercício 8.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira um número na matriz ["+ linha +"]["+ coluna +"]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // procurar maior e menor
        int numeroMaior = matriz[0][0];
        int numeroMenor = matriz[0][0];

        for(int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                // procurar numero maior
                if (matriz[linha][coluna] > numeroMaior) {
                    numeroMaior = matriz[linha][coluna];
                }

                // procurar numero menor
                if (matriz[linha][coluna] < numeroMenor) {
                    numeroMenor = matriz[linha][coluna];
                }
            }
        }

        System.out.println("MENOR numero: " + numeroMenor);
        System.out.println("MAIOR numero: " + numeroMaior);

        System.out.println("*******************************");

        // imprimir matriz
        for(int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]);
            }
            System.out.println(" ");
        }
    }
}
