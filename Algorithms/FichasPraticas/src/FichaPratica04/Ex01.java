package FichaPratica04;
import java.util.Objects;
import java.util.Scanner;

// Implemente um programa que peça ao utilizador dois valores
// e um carácter representando uma das quatro operações aritméticas (+, -, *, /).
// Apresente o resultado de aplicar a operação correspondente aos valores.
// No final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos.
// Exemplo: Deseja continuar? (introduza s/n).

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2, resultado = 0;
        String caracterOperacao = "";
        String opcaoContinuar = "";

        do {
            System.out.print("Insira o primeiro número: ");
            numero1 = input.nextInt();
            System.out.print("Insira o segundo número número: ");
            numero2 = input.nextInt();
            System.out.print("Insira a operação que deseja fazer (+, -, /, *): ");
            caracterOperacao = input.next();

            if (Objects.equals(caracterOperacao, "+")) {
                resultado = numero1 + numero2;
            } else if (Objects.equals(caracterOperacao, "-")) {
                resultado = numero1 - numero2;
            } else if (Objects.equals(caracterOperacao, "/")) {
                resultado = numero1 / numero2;
            } else if (Objects.equals(caracterOperacao, "*")) {
                resultado = numero1 * numero2;
            }

            System.out.println(numero1 + " " + caracterOperacao + " " + numero2 + " = " + " " +  resultado);

            System.out.print("Deseja continuar? (introduza s/n): ");
            input.nextLine();
            opcaoContinuar = input.next();
        } while (!Objects.equals(opcaoContinuar, "n"));

        System.out.print("Programa Encerrado");
    }
}
