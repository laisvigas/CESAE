package FichaPratica03;

// Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n. Utilize o ciclo while.
// Exemplo de Fatorial de 5: 5x4x3x2x1=120
// Exemplo de Fatorial de 8: 8x7x6x5x4x3x2x1=40320
// Nota: O número máximo permitido para um número inteiro é 2 147 483 647
// Fatorial de 12 = 479 001 600
// Fatorial 13 = 6 227 020 800
// Por isso, neste exercício tenha atenção aos valores de teste.


import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput = 0;
        long resultado = 1;
        int contador = 1;

        System.out.print("Introduza um número para saber o seu fatorial: ");
        userInput = input.nextInt();


        while (contador <= userInput) {
            resultado *= contador;
            contador++;
        }

        System.out.println("O fatorial de " + userInput + " é: " + resultado);
    }
}
