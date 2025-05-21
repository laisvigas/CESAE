package FichaPratica06;

// Implemente uma função void fazerBarulho( ) que receba um animal (String) como argumento.
// De seguida, de acordo com o animal deve fazer o barulho característico
// (Ex.: Cão – “Au au au” | Gato – “Miau” | Peixe - “Glub Glub” | Vaca – “Muuuu” | Porco – “Oinc oinc”).

public class Ex01 {
    public static void fazerBarulho(String animal) {
        switch (animal) {
            case "Cão":
                System.out.println("Au, au, au!");
                break;
            case "Gato":
                System.out.println("Miau!");
                break;
            case "Peixe":
                System.out.println("Glub, glub!");
                break;
            case "Vaca":
                System.out.println("Muuuuuu!");
                break;
            case "Porco":
                System.out.println("Oinc, oinc!");
                break;
            default:
                System.out.println("Animal não encontrado.");
        }
    }
}
