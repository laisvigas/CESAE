package FichaPratica05;
import java.util.Scanner;

// Escreva um programa que lê uma matriz de tamanho 5x5 e imprima a soma de todos os elementos

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int contador = 0;

        // ler matriz
        for(int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira um número: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        System.out.println("A soma de todos os números é: " + contador);
    }
}
