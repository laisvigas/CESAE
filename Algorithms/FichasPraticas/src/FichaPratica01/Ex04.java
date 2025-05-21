package FichaPratica01;
import java.util.Scanner;

// Escreva um programa para calcular a área da circunferência.
// As dimensões devem ser requisitadas ao utilizador.

public class Ex04 {
    public static void main(String[] args) {
        double perimetro, inputRaio;
        double pi = 3.14f;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza a o raio da circunferência: ");
        inputRaio = input.nextDouble();

        perimetro = pi * (inputRaio * inputRaio);

        System.out.println("A área da circunferência é: " + perimetro);
    }
}
