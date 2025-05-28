package Ex06;

public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro("Harry Potter", "J.K Rowling", "Fantasia", 364, 12443563);
        Livro livro2 = new Livro("20 Mil Léguas Submarias", "Julio Verne", "Ficção Cientifica", 400, 3456743);

        System.out.println(livro1.exibirDetalhes());
        System.out.println();
        System.out.println(livro2.exibirDetalhes());
    }
}
