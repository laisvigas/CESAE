package Ex07;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Zelda", 20, "zelda@email.com", "Pequenas Criaturas", 15f);
        Aluno aluno2 = new Aluno("Link", 20, "link@email.com", "Sementes Korok", 7.5f);

        if (aluno1.situacaoAprovado()){
            System.out.println(aluno1.getNome() + " passou!");
        } else {
            System.out.println(aluno1.getNome() + " perdeu!");
        }

        if (aluno2.situacaoAprovado()){
            System.out.println(aluno2.getNome() + " passou!");
        } else {
            System.out.println(aluno2.getNome() + " perdeu!");
        }
    }
}
