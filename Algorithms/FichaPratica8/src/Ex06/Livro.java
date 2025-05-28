package Ex06;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int numeroPaginas;
    private int ISBN;

    public Livro(String titulo, String autor, String categoria, int numeroPaginas, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numeroPaginas = numeroPaginas;
        this.ISBN = ISBN;
    }

    public String exibirDetalhes(){
        return "TITULO: " + this.titulo +
                "\nAUTOR: " + this.autor +
                "\nCATEGORIA: " + this.categoria +
                "\nNUMERO DE PÁGINAS: " + numeroPaginas +
                "\nISBN: " + this.ISBN;
    }
}
