package FichaPratica03;
import java.util.Scanner;

// 6. Faça um programa que leia dois números inteiros,
// representando os valores início e fim de um intervalo e imprima os números inteiros neste intervalo.

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        while(num1 <= num2)
        {
            System.out.println(num1);
            num1 += 1;
        }

    }
}
