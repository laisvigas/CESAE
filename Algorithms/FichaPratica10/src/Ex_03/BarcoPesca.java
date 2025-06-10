package Ex_03;
import java.util.ArrayList;

public class BarcoPesca {
    private String nome, cor;
    private int anoFabrico, tripulacao;
    private double capacidadeCarga;
    private Marca marca;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscosPescados;

    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscosPescados = new ArrayList<Marisco>();
    }

    public void exibirDetalhes(){
        System.out.println("Capacidade de Carga: " + this.capacidadeCarga);
        System.out.println("___________________________________________");
        System.out.println("Peixes Pescados: ");
        for (Peixe peixeAtual : this.peixesPescados){
            System.out.println(peixeAtual.getEspecie() + " | " + peixeAtual.getPeso() + " | " + peixeAtual.getPrecoKg());
        }
        System.out.println("___________________________________________");
        System.out.println("Mariscos Pescados: ");
        for (Marisco mariscoAtual : this.mariscosPescados){
            System.out.println(mariscoAtual.getEspecie() + " | " + mariscoAtual.getPeso() + " | " + mariscoAtual.getPrecoKg());
        }
        System.out.println("___________________________________________");
    }

    public void pescarPeixe(Peixe peixe){
        if (peixe.getPeso() < this.capacidadeCarga){
            this.peixesPescados.add(peixe);
            this.capacidadeCarga -= peixe.getPeso();
            System.out.println(peixe.getEspecie() + " de " + peixe.getPeso() + "Kgs acabou de ser pescado.");
        } else {
            System.out.println(peixe.getEspecie() + " de " + peixe.getPeso() + "Kgs não foi pescado. Barco muito cheio.");
        }
    }

    public void pescarMarisco(Marisco marisco){
        if (marisco.getPeso() < this.capacidadeCarga){
            this.mariscosPescados.add(marisco);
            this.capacidadeCarga -= marisco.getPeso();
            System.out.println(marisco.getEspecie() + " de " + marisco.getPeso() + "Kgs acabou de ser pescado.");
        } else {
            System.out.println(marisco.getEspecie() + " de " + marisco.getPeso() + "Kgs não foi pescado. Barco muito cheio.");
        }
    }

    public void largarPeixe(Peixe peixeAremover){
        peixesPescados.remove(peixeAremover);
        this.capacidadeCarga += peixeAremover.getPeso();
    }

    public void largarMarisco(Marisco mariscoAremover){
        mariscosPescados.remove(mariscoAremover);
        this.capacidadeCarga += mariscoAremover.getPeso();
    }

    public float calcularTotal(){
        float total = 0;
        for (Peixe peixeAtual : this.peixesPescados){
             total += peixeAtual.getPeso() * peixeAtual.getPrecoKg();
        }
        for (Marisco mariscoAtual : this.mariscosPescados){
            total += mariscoAtual.getPeso() * mariscoAtual.getPrecoKg();
        }
        return total;
    }

    public float salarioTripulacao(){
        return (calcularTotal() * 0.6f) / this.tripulacao;
    }
}

