package FichaPratica03;

// 4. Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput;
        int numero = 0;

        System.out.print("Insira um número: ");
        userInput = input.nextInt();

        while(numero <= userInput) {
            System.out.println(numero);
            numero += 1;
        }
    }
}
