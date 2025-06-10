package Ex_02;

//a) Instancie 7 pessoas, definindo os seus parâmetros (uma delas com menos de 18 anos).
//b) Intancie um sorteio, definindo os seus parâmetros.
//c) Tente inscrever as 7 pessoas no sorteio.
//d) Imprima os participantes.
//e) Imprima as informações do vencedor.


import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Jim", 35, 123456, "jim@email.com");
        Pessoa pessoa2 = new Pessoa("Pam", 30, 253463, "pam@email.com");
        Pessoa pessoa3 = new Pessoa("Dwight", 37, 325635, "dwight@email.com");
        Pessoa pessoa4 = new Pessoa("Stanley", 50, 2462466, "stanley@email.com");
        Pessoa pessoa5 = new Pessoa("Kelly", 29, 123456, "kelly@email.com");
        Pessoa pessoa6 = new Pessoa("Toby", 39, 453267, "Toby@email.com");
        Pessoa pessoa7 = new Pessoa("Cece", 5, 4352355, "cece@email.com");

        Sorteio sorteio = new Sorteio("PowerPaper", "Two Paper Packages");

        sorteio.inscreverParticipante(pessoa1);
        sorteio.inscreverParticipante(pessoa2);
        sorteio.inscreverParticipante(pessoa3);
        sorteio.inscreverParticipante(pessoa4);
        sorteio.inscreverParticipante(pessoa5);
        sorteio.inscreverParticipante(pessoa6);
        sorteio.inscreverParticipante(pessoa7);


        sorteio.imprimirParticipantes();

        System.out.println();
        System.out.println("**********************");
        System.out.println("VENCEDOR");
        sorteio.sortear();
    }
}
