package FichaPratica03;

// Escreva um algoritmo que leia uma quantidade desconhecida
// de números inteiros positivos fornecidos pelo utilizador
// e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100].
// A entrada de dados deve terminar quando for lido um número negativo.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ate25 = 0, ate50 = 0, ate75 = 0, ate100 = 0;
        int userInput = 0;

        while (userInput >= 0)
        {
            System.out.print("Digite um número: ");
            userInput = input.nextInt();

            if (userInput <= 25 && userInput > 0)
            {
                ate25 += 1;
            } else if (userInput <= 50) {
                ate50 += 1;
            } else if (userInput <= 75) {
                ate75 += 1;
            } else if (userInput <= 100) {
                ate100 += 1;
            }
        }

        System.out.println("[00 - 25]: " + ate25);
        System.out.println("[26 - 50]: " + ate50);
        System.out.println("[51 - 75]: " + ate75);
        System.out.println("[76 - 100]: " + ate100);
    }
}
