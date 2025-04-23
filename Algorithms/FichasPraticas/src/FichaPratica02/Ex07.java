package FichaPratica02;

// Escreva um programa que leia um número, depois apresente se é par ou ímpar.

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Intrduza um valor: ");
        numero = input.nextInt();


        if (numero % 2 == 0)
        {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");
        }
    }
}
