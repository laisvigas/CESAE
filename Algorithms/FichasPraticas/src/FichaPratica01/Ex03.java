package FichaPratica01;
import java.util.Scanner;

// Escreva um programa que calcule e apresente a área
// e o perímetro de um retângulo. As dimensões devem ser requisitadas ao utilizador.

public class Ex03 {
    public static void main(String[] args) {
        float area, perimetro, inputBase, inputAltura;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza a base do retângulo: ");
        inputBase = input.nextFloat();

        System.out.print("Introduza a altura do retângulo: ");
        inputAltura = input.nextFloat();

        area = inputBase * inputAltura;
        perimetro = (2 * inputBase) + (2 * inputAltura);

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }
}
