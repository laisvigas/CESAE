package FichaPratica02;
import java.util.Scanner;

// Implemente um programa de menu (opções do menu):
// 1. Criar
// 2. Atualizar
// 3. Eliminar
// 4. Sair
// Se uma das opções 1, 2 ou 3 for escolhida, imprima na tela a opção selecionada,
// se for a 4 não deve fazer nada. Caso a opção for inválida, deve informar o utilizador.

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        System.out.print("Insira a sua opção: ");
        opcao = input.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("Opção escolhida: 1. Criar");
                break;
            case 2:
                System.out.println("Opção escolhida: 2. Atualizar");
                break;
            case 3:
                System.out.println("Opção escolhida: 3. Eliminar");
                break;
            case 4:
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

    }
}
