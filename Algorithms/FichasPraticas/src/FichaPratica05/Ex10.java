package FichaPratica05;

// Faça um programa que preencha cada posição de uma matriz 3x5
// com valores inteiros introduzidos pelo utilizador.
// Deverá depois ler um outro valor do utilizador e indicar quantos vezes existe na matriz.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        int numeroInput;
        int contador = 0;

        // ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira um número na matriz ["+ linha +"]["+ coluna +"]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        System.out.print("Insira um número para saber se ele está presente na matriz: ");
        numeroInput = input.nextInt();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (numeroInput == (matriz[linha][coluna])) {
                    contador++;
                }
            }
        }

        System.out.println("O número " + numeroInput + " aparece " + contador + " vezes na matriz");
    }
}
