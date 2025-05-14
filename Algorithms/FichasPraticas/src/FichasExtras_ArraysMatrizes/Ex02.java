package FichasExtras_ArraysMatrizes;

// Escreva um programa que permita adicionar 10 números inteiros a um array
// e que os imprima pela ordem inversa de inserção.

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        // Ler valores para vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor no array [" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int contador = vetor.length;
        // imprimir valores
        for(int i = 0; i < vetor.length; i++){
            contador--;
            System.out.println(vetor[contador]);;
        }
    }
}
