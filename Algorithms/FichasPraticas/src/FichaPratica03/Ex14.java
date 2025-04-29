package FichaPratica03;

// Escreva um programa que leia uma sequência de números inteiros do utilizador
// e determine se a sequência está em ordem crescente.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput, userInputNumeros, extraUserInput;
        int contador = 0;
        String crescenteOuDecrescente = " ";

        System.out.print("Quantos números deseja inserir? ");
        userInput = input.nextInt();


        System.out.print("Introduza um número: ");
        extraUserInput = input.nextInt();
        while (contador < userInput - 1)
        {
            System.out.print("Introduza um número: ");
            userInputNumeros = input.nextInt();
            contador ++;

            if (extraUserInput < userInputNumeros) {
                crescenteOuDecrescente = "Crescente";
            } else {
                crescenteOuDecrescente = "Decrescente";
            }
        }

        System.out.println(crescenteOuDecrescente);
    }
}
