package FichaPratica05;

// Escreva um programa que lê um array de tamanho 10
// e verifica se os elementos estão em ordem crescente.

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        boolean crescente = true;

        // ler vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            vetor[i] = input.nextInt();
        }

        for(int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                crescente = false;
            }
        }

        if (crescente){
            System.out.println("Crescente");
        } else {
            System.out.println("Não é crescente");
        }
    }
}
