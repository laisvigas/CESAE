package FichaPratica01;

// Escreva um programa que leia dois valores inteiros
// e os armazene na variáveis valor1 e valor2.
// Permute o valor das variáveis e apresente o resultado.
// De seguida, verifique se consegue efetuar esta troca sem criar variáveis adicionais

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int valor1, valor2;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.print("Introduza o segundo valor: ");
        valor2 = input.nextInt();

        // Apresentar valores
        System.out.println("Valor 1 = " + valor1);
        System.out.println("Valor 2 = " + valor2);

        // Trocando valores com mais uma variável
        // int aux = valor1;
        // valor1 = valor2;
        // valor2 = aux;

        // Trocando valores sem mais uma variável
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        // Apresentar Valores
        System.out.println("Valor 1 = " + valor1);
        System.out.println("Valor 2 = " + valor2);
    }
}
