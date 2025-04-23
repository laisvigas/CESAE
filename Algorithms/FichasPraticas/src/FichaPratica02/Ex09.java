package FichaPratica02;

// Crie um programa que mostre o menor de três números inteiros lidos.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2, numero3, menorValor;

        System.out.print("Insira o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        numero2 = input.nextInt();

        System.out.print("Insira o terceiro número: ");
        numero3 = input.nextInt();

        if (numero1 < numero2 && numero1 < numero3)
        {
            menorValor = numero1;
        } else if (numero2 < numero1 && numero2 < numero3) {
            menorValor = numero2;
        } else
        {
            menorValor = numero3;
        }

        System.out.println("O menor valor é: " + menorValor);
    }
}
