package FichaPratica02;
import java.util.Scanner;

// Determine e escreva o montante de impostos a pagar sobre um salário anual lido,
// tendo em conta o seguinte:
// a. Salário até 15.000€ inclusive paga taxa de 20%
// b. Salário superior a 15.000€ paga taxa de 30%

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;
        double salarioComTaxa;

        System.out.print("Introduza o valor do salário anual: ");
        salario = input.nextDouble();

        if (salario > 15000) {
            salarioComTaxa = salario * 0.30;
        } else {
            salarioComTaxa = salario * 0.20;
        }

        System.out.printf("O valor de taxa a pagar é de R$" + salarioComTaxa);
    }
}
