package FichaPratica03;

import java.util.Scanner;

// Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.
// Por exemplo: Leu 15, deve imprimir: 10 11 12 13 14 16 17 18 19 20

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Insira um número: ");
        numero = input.nextInt();

        int contador = numero - 5;

        while(contador <= numero + 5)
        {
            if (contador != numero)
            {
                System.out.println(contador);
            }
            contador += 1;
        }
    }
}
