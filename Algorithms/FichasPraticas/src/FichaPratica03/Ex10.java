package FichaPratica03;

// Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
// Suponha que o número lido da entrada será maior que 2.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int contador = 0;
        
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        while (contador <= numero - 2)
        {
            contador += 2;
            System.out.println(contador);
        }

        if (numero % 2 != 0)
        {
            System.out.println(numero);
        }

    }
}
