package FichaPratica02;
import java.util.Scanner;

// Escreva um programa que leia dois números reais
// e pergunte ao utilizador qual a operação aritmética
// que quer realizar e apresente o resultado.
// O utilizador deve responder usando o símbolo da operação
// (exemplo: para fazer a soma, o utilizador deve escrever ‘+’).
// Se for inválido apresente erro.

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero1, numero2;
        String operacao;
        double resultado;

        System.out.print("Insira o primeiro número: ");
        numero1 = input.nextDouble();

        System.out.print("Insira o segundo número: ");
        numero2 = input.nextDouble();

        System.out.print("Insira qual operação deseja fazer [+ - % x]: ");
        operacao = input.next();

        switch(operacao) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + resultado);
                break;
            case "%":
                resultado = numero1 / numero2;
                System.out.println(numero1 + " % " + numero2 + " = " + resultado);
                break;
            case "x":
                resultado = numero1 * numero2;
                System.out.println(numero1 + " x " + numero2 + " = " + resultado);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}
