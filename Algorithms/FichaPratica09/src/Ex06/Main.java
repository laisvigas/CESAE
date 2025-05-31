package Ex06;

public class Main {
    public static void main(String[] args){
        Atleta atleta1 =  new Atleta("Mario", "Pulo",
                1.50f, 60f, "Itália", 4);
        Atleta atleta2 =  new Atleta("Peaches", "Pulo",
                1.20f, 40f, "Inglaterra", 3);
        Atleta atleta3 =  new Atleta("Link", "Esgrima",
                1.50f, 60f, "Hyrule", 1);
        Atleta atleta4 =  new Atleta("Samus", "Luta",
                1.70f, 65f, "K-2L", 2);
        Atleta atleta5 =  new Atleta("Luigi", "Corrida",
                1.55f, 62f, "Itália", 5);
        Atleta atleta6 =  new Atleta("Warrio", "Bicicleta",
                1.55f, 70f, "Portugal", 6);


        Competicao competicaoItalia = new Competicao("Itália - Competição BigN",
                "Itália", 3);

        Competicao competicaoPortugal = new Competicao("Portugal - Competição BigN",
                "Portugal", 3);

        // a) Instancie 6 Atletas, definindo todos os seus atributos.
        //b) Instancie duas Competições.
        //c) Adicione 2 pessoas à Agenda.
        //d) Adicione e liste os participantes de cada uma das Competições.
        //e) Apresente os atletas da casa das competições.

        // há como inscrever e listar os atletas ao mesmo tempo?
        competicaoItalia.inscreverAtleta(atleta1);
        competicaoItalia.inscreverAtleta(atleta2);
        competicaoItalia.inscreverAtleta(atleta3);
        competicaoItalia.inscreverAtleta(atleta3);

        System.out.println("_____________________________");
        competicaoItalia.listarParticipantes();

        System.out.println();
        System.out.println("ATLETAS DA CASA");
        competicaoItalia.atletasDaCasa();
    }
}
