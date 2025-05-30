package Ex05;

public class Agenda {
    private int AnoDeCriacao = 2025;
    private Pessoa[] listaContactos;

    public Agenda(int tamanhoLista) {
        this.listaContactos = new Pessoa[tamanhoLista];
    }

    public void adicionarContactos(Pessoa contactoNovo){
        for (int i = 0; i < this.listaContactos.length; i++){
            if(this.listaContactos[i] == null){
                // encontramos uma posição vazia

                // preenchemos a posição vazia com o novo contacto
                this.listaContactos[i] = contactoNovo;

                // terminamos o méttodo para não continuar
                // adicionando os próximos espaços com a mesma pessoa
                return;
            }
        }
    }

    public void listarContactos(){
        for (int i = 0; i < this.listaContactos.length; i++){
            if (this.listaContactos[i] != null){
                this.listaContactos[i].exibirDetalhes();
            }
        }
    }

    public void pesquisarContactos(String cidadePesquisar){
        System.out.println("\nExibindo Contactos da cidade de " + cidadePesquisar);
        for (int i = 0; i < this.listaContactos.length; i++){
            if (this.listaContactos[i].getCidade().equalsIgnoreCase(cidadePesquisar)){
                this.listaContactos[i].exibirDetalhes();
            }
        }
    }

}
