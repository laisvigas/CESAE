package Ex05;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Joaquim", 30, "Porto", "quim@email.com", 9234561);
        Pessoa pessoa2 = new Pessoa("Joana", 29, "Lisboa", "joana@email.com", 4546467);
        Pessoa pessoa3 = new Pessoa("Ana", 40, "Lisboa", "ana@email.com", 2646758);
        Pessoa pessoa4 = new Pessoa("Maria", 19, "Vila Nova de Gaia", "maria@email.com", 268553);

        Agenda aMinhaAgenda = new Agenda(4);
        aMinhaAgenda.adicionarContactos(pessoa1);
        aMinhaAgenda.adicionarContactos(pessoa2);

        aMinhaAgenda.listarContactos();

        System.out.println("\nAdicionando mais contactos: ");
        aMinhaAgenda.adicionarContactos(pessoa3);
        aMinhaAgenda.adicionarContactos(pessoa4);
        aMinhaAgenda.listarContactos();

        System.out.println();
        aMinhaAgenda.pesquisarContactos("Lisboa");
    }
}
