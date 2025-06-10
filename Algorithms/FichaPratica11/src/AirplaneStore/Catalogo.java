package AirplaneStore;
import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> catalogoAvioes;

    public Catalogo() {
        this.catalogoAvioes = new ArrayList<Aviao>();
    }

    public void adquirirAviao(Aviao aviao){
        catalogoAvioes.add(aviao);
    }

    public void venderAviao(Aviao aviao){
        catalogoAvioes.remove(aviao);
    }

    public double calcularTotal(){
        double total = 0;
        for (Aviao aviao : catalogoAvioes){
            total += aviao.getPreco();
        }
        return total;
    }

    public void listarCatalogo(){
        for (Aviao aviao : catalogoAvioes){
            System.out.println("Modelo: " + aviao.getModelo());
            System.out.println("Preço: " + aviao.getPreco());
            if (aviao instanceof JatoPrivado jato) {
                System.out.println("Lotação: " + jato.getLotacao());
                System.out.println("Capacidade de Bagagem: " + jato.getCapacidade_bagagem());
                System.out.println("Categoria: " + jato.getCategoria());
            } else if (aviao instanceof AviaoCombate aviaoComb){
                System.out.println("País de Origem: " + aviaoComb.getPaisOrigem());
                System.out.println("Camuflagem: " + aviaoComb.isCamuflagem());
            }
        }
    }
}
