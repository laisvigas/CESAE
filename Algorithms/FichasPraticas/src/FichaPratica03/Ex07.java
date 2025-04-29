package FichaPratica03;

// Faça um programa que imprima os números inteiros de 1 a 100 inclusive,
// e no final imprima também o valor do seu somatório.
// (Não necessita de Scanner ou input do utilizador)

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 1;
        int somatorio = 0;

        while(contador <= 100)
        {
            System.out.println(contador);
            contador += 1;
            somatorio += contador;
        }
        System.out.println("Somatório: " + somatorio);
    }
}
