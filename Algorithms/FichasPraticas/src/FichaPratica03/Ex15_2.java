package FichaPratica03;
import java.util.Scanner;

// Desafio Extra: Refazer o exercício 15 (fatorial)
// com a proibição de usar o operador da multiplicação *.

public class Ex15_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput = 0;
        long resultado = 1;
        int contador = 1;

        System.out.print("Introduza um número para saber o seu fatorial: ");
        userInput = input.nextInt();

        while (contador <= userInput) {
            resultado = multiplicar(resultado, contador);
            contador++;
        }

        System.out.println("O fatorial de " + userInput + " é: " + resultado);
    }

    public static long multiplicar(long a, long b) {
        long total = 0;
        for (int i = 0; i < b; i++) {
            total += a;
        }
        return total;
    }
}