package Ex09;

// a) Instâncie um funcionário, definindo os seus atributos usando o construtor.
// b) Exiba todos os dados do funcionário.
// c) Aumente o salário.
// d) Exiba novamente os dados do funcionário.

public class Main {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Jim", "jim@dundermifflin.com", "Vendas", 3500);

        // exibir dados do funcionário
        System.out.println("FUNCIONARIO: " + funcionario1.getNome());
        System.out.println("EMAIL: " + funcionario1.getEmail());
        System.out.println("DEPARTAMENTO: " + funcionario1.getDepartamento());
        System.out.println("SALÁRIO: $" + funcionario1.getSalario());

        // aumentar salario
        funcionario1.aumentarSalario(10);
        funcionario1.setDepartamento("Manager");

        // exibir novamente os dados do funcionário
        System.out.println();
        System.out.println("FUNCIONARIO: " + funcionario1.getNome());
        System.out.println("EMAIL: " + funcionario1.getEmail());
        System.out.println("DEPARTAMENTO: " + funcionario1.getDepartamento());
        System.out.println("SALÁRIO: $" + funcionario1.getSalario());
    }
}
