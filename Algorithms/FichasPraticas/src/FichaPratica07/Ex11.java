package FichaPratica07;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Escreva um programa que leia um ficheiro de texto contendo informações de eventos
// (nome, dia, mês, ano, local, lotação)
// e exiba as informações dos eventos que irão ocorrer num determinado mês.

public class Ex11 {
    public static void pesquisarEventoPorMes(String caminhoFicheiro, String mes) throws FileNotFoundException {
        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);
        sc.nextLine();

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] itensDaLinha = linha.split(",");
            if (itensDaLinha[2].equals(mes)) {
                System.out.println(itensDaLinha[0]);
            }
        }
        sc.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o mês que gostaria de saber os eventos: ");
        String mesAPesquisar = input.next();
        System.out.println();
        System.out.println("Eventos do mês de " + mesAPesquisar);

        pesquisarEventoPorMes("Ficheiros/exercicio_11.csv", mesAPesquisar);
    }
}
