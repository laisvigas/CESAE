package Ex03;

// a) Instancie um Animal, definindo todos os seus atributos.
// b) O animal faz barulho.
// c) Tente alimentar o animal com algo que ele não gosta (verifique se o peso se mantém igual).
// d) Alimento o animal com algo que ele gosta.

public class Main {
    public static void main(String[] args){
        Animal animal1 = new Animal("Jim", "Coelho", "Portugal",
                500, new String[] {"alface", "grama", "folhas"}, Reino.MAMÍFERO);

        // fazendo barulho
        System.out.println(animal1.fazerBarulho());

        // alimentando com algo que ele não gosta
        System.out.println(animal1.comer("uva", 20));

        System.out.println();
        System.out.println("SITUAÇÃO DO ANIMAL:");
        System.out.println(animal1.exibirDetalhes());

        // alimentando com algo que ele gosta
        System.out.println();
        System.out.println(animal1.comer("alface", 20));

        System.out.println();
        System.out.println("SITUAÇÃO DO ANIMAL:");
        System.out.println(animal1.exibirDetalhes());
    }
}
