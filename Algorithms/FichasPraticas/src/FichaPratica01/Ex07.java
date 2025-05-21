package FichaPratica01;
import java.util.Scanner;

// Escreva um programa que requisite ao utilizador
// o preço de 3 produtos adquiridos. Apresente o valor a pagar,
// considerando que deverá ter um desconto de 10% sobre o total dos produtos.

public class Ex07 {
    public static void main(String[] args) {
        float produto1, produto2, produto3, valorCompra, valorDesconto, precoFinal;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o valor do primeiro produto: ");
        produto1 = input.nextFloat();

        System.out.print("Introduza o valor do segundo produto: ");
        produto2 = input.nextFloat();

        System.out.print("Introduza o valor do terceiro produto: ");
        produto3 = input.nextFloat();

        valorCompra = produto1 + produto2 + produto3;
        valorDesconto = valorCompra * 0.10f;
        precoFinal = valorCompra - valorDesconto;

        System.out.println("Valor a pagar: €" + precoFinal);
    }
}
