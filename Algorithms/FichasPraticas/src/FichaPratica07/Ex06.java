package FichaPratica07;

// Escreva um programa que leia um ficheiro de texto contendo nomes
// e idades separados por vírgulas e imprima o nome da pessoa mais velha na consola.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {
    public static String imprimirNomePessoaMaisVelha(String caminhoFicheiro) throws FileNotFoundException {
        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);
        int idade = 0;
        String nome = "";

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] itensDaLinha = linha.split(",");
            if (Integer.parseInt(itensDaLinha[1]) > idade) {
                nome = itensDaLinha[0];
                idade = Integer.parseInt(itensDaLinha[1]);
            }
        }
        return nome;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(imprimirNomePessoaMaisVelha("Ficheiros/exercicio_06.txt"));
    }
}
