package FichaPratica05;

// Implemente um programa que armazene num array 10 valores pedidos ao utilizador,
// e retorne o maior valor par inserido. Caso não exista, deverá informar o utilizador.

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[4];
        int maiorNumero = 0;

        // ler vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            vetor[i] = input.nextInt();
        }

        maiorNumero = vetor[0];

        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0 && vetor[i] >= maiorNumero) {
                maiorNumero = vetor[i];
            }
        }

        if (maiorNumero % 2 == 0) {
            System.out.println("O maior par é: " + maiorNumero);
        } else {
            System.out.println("Não há números pares na lista");
        }
    }
}
