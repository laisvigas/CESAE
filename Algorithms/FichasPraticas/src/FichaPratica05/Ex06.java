package FichaPratica05;

// Escreva um programa que lê um array de tamanho 10
// e verifica se os elementos estão em ordem crescente.

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int maiorNumero = 0;
        boolean naoEstaCrescente = false;

        // ler vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            vetor[i] = input.nextInt();
        }


        maiorNumero = vetor[0];

        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= maiorNumero) {
                maiorNumero = vetor[i];
            } else {
                naoEstaCrescente = true;
            }
        }

        if (naoEstaCrescente){
            System.out.println("O array não está em ordem crescente");
        } else {
            System.out.println("O array está em ordem crescente");
        }
    }
}
