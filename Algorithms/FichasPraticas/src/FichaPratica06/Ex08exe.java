package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex08.somarMatrizes;
import static FichaPratica06.Ex08.somatorioMatrizes;

public class Ex08exe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matriz2 = new int[3][3];

        // ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira um número na matriz ["+ linha +"]["+ coluna +"]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // ler matriz 2
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira um número na matriz ["+ linha +"]["+ coluna +"]: ");
                matriz2[linha][coluna] = input.nextInt();
            }
        }

        System.out.println("Matriz 1 somada aos elementos da Matriz 2");
        somarMatrizes(matriz, matriz2);

        System.out.print("Todos os elementos somados da matriz é = " + somatorioMatrizes(matriz, matriz2));
    }
}
