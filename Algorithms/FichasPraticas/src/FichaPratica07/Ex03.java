package FichaPratica07;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro ficheiro.

public class Ex03 {
    public static void lerECopiarFicheiro(String caminhoFicheiro, String novoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);

        String[] mensagemLida = null;
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            mensagemLida = linha.split(" ");
        }

        PrintWriter pw = new PrintWriter(novoFicheiro);

        for (int i = 0; i < mensagemLida.length; i++) {
            pw.print(mensagemLida[i]);
        }

        pw.close();
    }

    public static void copiarFicheiro(String caminhoFicheiro, String novoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);
        PrintWriter pw = new PrintWriter(novoFicheiro);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            pw.println(linha);
        }

        pw.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        lerECopiarFicheiro("Ficheiros/resol_ex02", "Ficheiros/resol_ex03");
    }
}
