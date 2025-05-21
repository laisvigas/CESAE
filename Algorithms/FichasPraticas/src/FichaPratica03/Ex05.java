package FichaPratica03;

// Faça um programa que leia um número inteiro e, de seguida, leia uma mensagem.
// Depois imprima a mensagem x vezes, sendo x o número inteiro lido.

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 1;
        int userInput;
        String mensagem;

        System.out.print("Insira um número: ");
        userInput = input.nextInt();

        System.out.print("Insira uma mensagem: ");
        input.nextLine();
        mensagem = input.nextLine();

        while(contador <= userInput)
        {
            System.out.println(mensagem);
            contador += 1;
        }

    }
}
