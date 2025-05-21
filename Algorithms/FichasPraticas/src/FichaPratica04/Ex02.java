package FichaPratica04;
import java.util.Scanner;

// Implemente um programa que leia a opção do menu desejada (opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair).
// Se uma das opções 1, 2 e 3 for escolhida, deverá apresentar um texto com a opção escolhida.
// Caso a escolha esteja fora das opções válidas, deverá informar o utilizador.
// De seguida, deverá apresentar novamente o menu para poder selecionar novas opções até que a opção 4 seja escolhida.

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha uma das opções abaixo");
            System.out.print("opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Opção escolhida: 1. Criar");
            } else if (opcao == 2) {
                System.out.println("Opção escolhida: 2. Atualizar");
            } else if (opcao == 3) {
                System.out.println("Opção escolhida: 3. Eliminar");
            } else {
                System.out.println("Opção inválida");
            }
        } while (opcao != 4);

        System.out.println("Programa Encerrado");
    }
}
