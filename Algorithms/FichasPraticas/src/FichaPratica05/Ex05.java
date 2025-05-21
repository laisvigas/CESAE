package FichaPratica05;

// 5. Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos.

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int soma = 0;
        float media;

        // ler vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Insira a " + (i + 1) + "º nota: ");
            vetor[i] = input.nextInt();
            soma += vetor[i];
        }

        media = (float) soma / vetor.length;

        System.out.println("A média das notas é: " + media);
    }
}
