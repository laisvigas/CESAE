package FichaPratica01;
import java.util.Scanner;

//  Escreva um programa que faça a soma de dois números
//  introduzidos pelo utilizador. Apresente o resultado da operação.

public class Ex01 {
    public static void main(String[] args) {
        int num1, num2, soma;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        num2 = scanner.nextInt();

        soma = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " = " + soma);
    }
}
