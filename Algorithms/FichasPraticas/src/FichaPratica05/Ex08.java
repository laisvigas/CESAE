package FichaPratica05;
import java.util.Scanner;

// Implemente um programa que permita adicionar 9 números inteiros (ler input do utilizador)
// a uma matriz 3x3 e que os imprima com o seguinte aspeto gráfico:
//                              3 8 1
//                              7 4 2
//                              5 1 9


public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // ler matriz
        for(int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira um número na matriz ["+ linha +"]["+ coluna +"]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // imprimir matriz
        for(int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]);
            }
            System.out.println(" ");
        }
    }
}
