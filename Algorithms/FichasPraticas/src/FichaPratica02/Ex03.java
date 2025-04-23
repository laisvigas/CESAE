package FichaPratica02;

// Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
//a. Salário até 15.000€ inclusive paga taxa de 20%
//b. Salário de 15.000€ a 20.000€ inclusive paga taxa de 30%
//c. Salário de 20.000€ a 25.000€ inclusive paga taxa de 35%
//d. Salário superior a 25.000€ paga taxa de 40%

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        double imposto;

        System.out.print("Insira o salário para saber o valor de imposto a ser pago: ");
        salario = input.nextInt();

        if (salario <= 15000)
        {
            imposto = salario * 0.20;
            System.out.println("Paga taxa de 20%: " + imposto);
        } else if (salario <= 20000) {
            imposto = salario * 0.30;
            System.out.println("Paga taxa de 30%: " + imposto);
        } else if (salario <= 25000) {
            imposto = salario * 0.35;
            System.out.println("Paga taxa de 35%: " + imposto);
        } else {
            imposto = salario * 0.40;
            System.out.println("Paga taxa de 40%: " + imposto);
        }


    }
}
