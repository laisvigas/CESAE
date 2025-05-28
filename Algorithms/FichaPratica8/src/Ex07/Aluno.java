package Ex07;

public class Aluno {
    private String nome;
    private int idade;
    private String email;
    private String curso;
    private float media;

    public Aluno(String nome, int idade, String email, String curso, float media) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.curso = curso;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getCurso() {
        return curso;
    }

    public float getMedia() {
        return media;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public int felizAniversario(){
        return this.idade + 1;
    }

    public boolean situacaoAprovado(){
        return this.media >= 9.5;
    }


}
