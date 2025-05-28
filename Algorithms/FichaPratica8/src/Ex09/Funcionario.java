package Ex09;

public class Funcionario {
    private String nome;
    private String email;
    private String departamento;
    private float salario;

    public Funcionario(String nome, String email, String departamento, float salario) {
        this.nome = nome;
        this.email = email;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Crie o méto|do aumentarSalario que recebe um valor real por parâmetro que representa a percentagem do
    // aumento a ser aplicado (por exemplo: recebe 15, representa um aumento de 15%).

    public void aumentarSalario(float percentagemAumento){
        float aumento = salario * percentagemAumento / 100;
        this.salario = this.salario + aumento;
    }
}
