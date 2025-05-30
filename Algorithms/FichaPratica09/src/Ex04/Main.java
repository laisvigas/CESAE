package Ex04;

// No Main:
// a) Instancie 2 Imóveis, definindo todos os seus atributos.
// b) Apresente as específicações do Imóvel mais caro.

public class Main {
    public static void main(String[] args){
        Imovel imovel1 = new Imovel("Rua das Flores", 123, "Lisboa",
                Tipo.APARTAMENTO, Acabamento.USADA, 80.0f, 2,
                1, 0.0f
        );

        Imovel imovel2 = new Imovel("Avenida das Palmeiras", 45, "Porto",
                Tipo.MANSAO, Acabamento.NOVA_COM_ALTO_ACABAMENTO, 350.0f, 6,
                4, 50.0f
        );

        System.out.print(imovel1.compararImoveis(imovel2));
    }
}
