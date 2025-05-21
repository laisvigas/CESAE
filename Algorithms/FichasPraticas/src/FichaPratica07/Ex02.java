package FichaPratica07;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem.

public class Ex02 {
    public static void criarFicheiro(String caminho, String mensagem) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        PrintWriter pw = new PrintWriter(ficheiro);

        pw.println(mensagem);

        pw.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        criarFicheiro("Ficheiros/resol_ex02", "Hello, World... again?!");
    }
}
