package FichaPratica05;

//4. Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int menorNumero = 0;

        // ler vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            vetor[i] = input.nextInt();
        }

        menorNumero = vetor[0];

        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= menorNumero) {
                menorNumero = vetor[i];
            }
        }

        System.out.println("O menor número do array é: " + menorNumero);
    }
}
