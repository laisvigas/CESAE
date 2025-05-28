package Ex01;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Maria dos Anjos",70, 1.50);
        Pessoa pessoa2 = new Pessoa ("Agapito Souza", 95, 1.80);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getAltura());

        System.out.println();

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getAltura());
    }
}
