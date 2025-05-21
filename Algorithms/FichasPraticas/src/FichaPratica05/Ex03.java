package FichaPratica05;
import java.util.Scanner;

// Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento.

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int maiorNumero = 0;

        // ler vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            vetor[i] = input.nextInt();
        }

        maiorNumero = vetor[0];

        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= maiorNumero) {
                maiorNumero = vetor[i];
            }
        }

        System.out.println("O maior número do array é: " + maiorNumero);
    }
}
