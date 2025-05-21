package FichaPratica03;

// Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto)
// e imprima os números inteiros de 0 até limite inclusive, com incremento de salto.
// Suponha que limite e salto são maiores que zero.
// Exemplo: Valores lidos: 10 (limite) e 3 (salto)
// Saída do algoritmo: 0 3 6 9

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, incremento;
        int contador = 0;

        System.out.print("Insira um número: ");
        numero = input.nextInt();

        System.out.print("Insira o incremento: ");
        incremento = input.nextInt();

        while (contador <= numero)
        {
            System.out.println(contador);
            contador += incremento;
        }
    }
}
