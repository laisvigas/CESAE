package VidaMundial;
import VidaMundial.Enums.Alimentacao;
import VidaMundial.Enums.Familia;
import VidaMundial.SeresVivos.*;

public class Main {
    public static void main(String[] args){

        Animal animal1 = new Animal("Leão", "Panthera leo", "África", 5, false, 190.5, 8.0, Alimentacao.CARNIVORO, "Rugido");
        Animal animal2 = new Animal("Elefante", "Loxodonta africana", "África", 12, false, 5400.0, 6.5, Alimentacao.HERBIVORO, "Barrito");
        Animal animal3 = new Animal("Lobo", "Canis lupus", "EUA", 4, true, 40.0, 7.0, Alimentacao.CARNIVORO, "Uivo");

        Inseto inseto1 = new Inseto("Formiga", "Formicidae", "Brasil", 1, false);
        Inseto inseto2 = new Inseto("Abelha", "Apis mellifera", "Portugal", 1, true);
        Inseto inseto3 = new Inseto("Borboleta", "Nymphalidae", "México", 0, false);

        Planta planta1 = new Planta("Samambaia", "Pteridophyta", "Brasil", 3, Familia.ERVAS, 2);
        Planta planta2 = new Planta("Pinheiro", "Pinus", "Canadá", 50, Familia.ARVORES, 5);


        MeioAmbiente floresta = new MeioAmbiente("Floresta", 200);
        System.out.println();
        floresta.adicionarSerVivo(animal1);
        floresta.adicionarSerVivo(animal2);
        floresta.adicionarSerVivo(animal3);
        floresta.adicionarSerVivo(inseto1);
        floresta.adicionarSerVivo(inseto2);
        floresta.adicionarSerVivo(inseto3);
        floresta.adicionarSerVivo(planta1);
        floresta.adicionarSerVivo(planta2);

        floresta.simulador(10);
    }
}