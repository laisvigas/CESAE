package VidaMundial;
import VidaMundial.SeresVivos.*;
import java.util.ArrayList;
import static VidaMundial.Enums.Alimentacao.*;

import java.util.List;
import java.util.Random;

public class MeioAmbiente {
    private String nome;
    private double agua;
    private ArrayList<SerVivo> seres;

    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<SerVivo>();
    }

    public void adicionarSerVivo(SerVivo serVivo){
        this.seres.add(serVivo);
        System.out.println("NOVA ESPÉCIE - NOME: " + serVivo.getNome()
                + " | ESPÉCIE: " + serVivo.getEspecie() + " | ORIGEM: "
                + serVivo.getPais() + " | IDADE: " + serVivo.getIdade());
    }

    public boolean plantaBebe(int indexPlanta) {
        if (indexPlanta < 0 || indexPlanta >= seres.size()) {
            return false;
        }

        SerVivo ser = seres.get(indexPlanta);

        if (ser instanceof Planta planta) {
            double quantidadeNecessaria = switch (planta.getFamilia()) {
                case ARVORES -> 1.0;
                case FLORES -> 0.1;
                case ERVAS -> 0.25;
                default -> 10;
            };

            if (this.agua >= quantidadeNecessaria) {
                this.agua -= quantidadeNecessaria;
                System.out.println(planta.getNome() + " bebeu " + quantidadeNecessaria + "L de água");
                return true;
            } else if (this.agua > 0) {
                double consumido = this.agua;
                this.agua = 0;
                System.out.println(planta.getNome() + " bebeu apenas " + consumido + "L de água (insuficiente)");
                return true;
            } else {
                System.out.println(planta.getNome() + " morreu por falta de água");
                seres.remove(indexPlanta);
                return false;
            }
        }

        return false;
    }

    public boolean plantaComeInsetos(int indexPlanta) {
        // verifica se index é válido
        if (indexPlanta < 0 || indexPlanta >= seres.size()) {
            System.out.println("Index inválido");
            return false;
        }

        SerVivo ser = seres.get(indexPlanta);

        if (!(ser instanceof Planta planta)) {
            System.out.println("Não há plantas no ecossistema");
            return false;
        }

        // procura por um inseto no ambiente
        for (int i = 0; i < seres.size(); i++) {
            SerVivo outroSer = seres.get(i);
            if (outroSer instanceof Inseto inseto) {
                // planta come o inseto
                System.out.println(planta.getNome() + " comeu " + inseto.getNome());
                // removendo o inseto do ambiente
                seres.remove(i);
                return true;
            }
        }

        // se não encontrou inseto, a planta morre
        System.out.println(planta.getNome() + " morreu pois não havia insetos para comer.");
        seres.remove(indexPlanta);
        return false;
    }

    public void plantaAbanaComVento(int indexPlanta) {
        SerVivo ser = seres.get(indexPlanta);
        if (ser instanceof Planta planta) {
            System.out.println("A planta " + planta.getNome() + " está chacoalhando com o vento!");
        } else {
            System.out.println("O ser no índice " + indexPlanta + " não é uma planta.");
        }
    }

    public void animalFazBarulho(int indexAnimal){
        SerVivo ser = seres.get(indexAnimal);
        if (ser instanceof Animal animal) {
            System.out.println(animal.getBarulho());
        } else {
            System.out.println("O ser no índice " + indexAnimal + " não é um animal.");
        }
    }

    public void animalMovimenta(int indexAnimal){
        SerVivo ser = seres.get(indexAnimal);
        if (ser instanceof Animal animal) {
            System.out.println("O " + animal.getNome() + " movimentou-se");
        } else {
            System.out.println("O ser no índice " + indexAnimal + " não é um animal.");
        }
    }

    public boolean animalCome(int indexAnimal){
        Random r = new Random();
        int randomIndexPresa;
        do {
            randomIndexPresa = r.nextInt(seres.size());
        } while (randomIndexPresa == indexAnimal);

        SerVivo ser = seres.get(indexAnimal);
        SerVivo presa = seres.get(randomIndexPresa);

        if (ser instanceof Animal animal) {
            if (animal.isFome()) {
                if (animal.getAlimentacao() == CARNIVORO || animal.getAlimentacao() == OMNIVORO) {
                    if (presa instanceof Animal animalPresa){
                        double capacidadeAnimalAtual = (1 * animal.getPesoKg()) + (2.5 * animal.getInteligencia());
                        double capacidadePresa = (1 * animalPresa.getPesoKg()) + (2.5 * animalPresa.getInteligencia());

                        if (capacidadeAnimalAtual >= capacidadePresa){
                            System.out.println(animal.getNome() + " atacou e comeu " + presa.getNome());
                            seres.remove(randomIndexPresa);
                            animal.setFome(false);
                            return true;
                        } else {
                            System.out.println(animal.getNome() + " atacou " + presa.getNome()
                                    + ", mas perdeu a batalha e morreu.");
                            seres.remove(indexAnimal);
                            animal.setFome(true);
                            return false;
                        }
                    } else if (presa instanceof Inseto insetoPresa) {
                        if (insetoPresa.isVenenoso()){
                            System.out.println(animal.getNome() + " morreu envenenado pelo inseto " + insetoPresa.getNome());
                            seres.remove(indexAnimal);
                            return false;
                        } else {
                            System.out.println(animal.getNome() + " comeu o inseto " + insetoPresa.getNome());
                            animal.setFome(false);
                            seres.remove(insetoPresa);
                            return true;
                        }
                    }
                } else if (animal.getAlimentacao() == HERBIVORO || animal.getAlimentacao() == OMNIVORO) {
                    if (presa instanceof Planta plantaPresa){
                        if (animal.getInteligencia() <= 20) {
                            if (plantaPresa.getGrauDefesa() == 0){
                                System.out.println(animal.getNome() + " comeu a planta" + plantaPresa.getNome());
                                seres.remove(plantaPresa);
                                animal.setFome(false);
                                return true;
                            } else {
                                System.out.println(animal.getNome() + " tentou comer a planta"
                                        + plantaPresa.getNome() + ", mas não conseguiu");
                                animal.setFome(true);
                                return false;
                            }
                        } else if (animal.getInteligencia() <= 40){
                            if (plantaPresa.getGrauDefesa() <= 1){
                                System.out.println(animal.getNome() + " comeu a planta" + plantaPresa.getNome());
                                seres.remove(plantaPresa);
                                animal.setFome(false);
                                return true;
                            } else {
                                System.out.println(animal.getNome() + " tentou comer a planta"
                                        + plantaPresa.getNome() + ", mas não conseguiu");
                                animal.setFome(true);
                                return false;
                            }
                        } else if (animal.getInteligencia() <= 60){
                            if (plantaPresa.getGrauDefesa() <= 2){
                                System.out.println(animal.getNome() + " comeu a planta" + plantaPresa.getNome());
                                seres.remove(plantaPresa);
                                animal.setFome(false);
                                return true;
                            } else {
                                System.out.println(animal.getNome() + " tentou comer a planta"
                                        + plantaPresa.getNome() + ", mas não conseguiu");
                                animal.setFome(true);
                                return false;
                            }
                        } else if (animal.getInteligencia() <= 80){
                            if (plantaPresa.getGrauDefesa() <= 3){
                                System.out.println(animal.getNome() + " comeu a planta" + plantaPresa.getNome());
                                seres.remove(plantaPresa);
                                animal.setFome(false);
                                return true;
                            } else {
                                System.out.println(animal.getNome() + " tentou comer a planta"
                                        + plantaPresa.getNome() + ", mas não conseguiu");
                                animal.setFome(true);
                                return false;
                            }
                        } else if (animal.getInteligencia() < 95) {
                            if (plantaPresa.getGrauDefesa() <= 4){
                                System.out.println(animal.getNome() + " comeu a planta" + plantaPresa.getNome());
                                seres.remove(plantaPresa);
                                animal.setFome(false);
                                return true;
                            } else {
                                System.out.println(animal.getNome() + " tentou comer a planta"
                                        + plantaPresa.getNome() + ", mas não conseguiu");
                                animal.setFome(true);
                                return false;
                            }
                        } else {
                            System.out.println(animal.getNome() + " comeu a planta" + plantaPresa.getNome());
                            seres.remove(plantaPresa);
                            animal.setFome(false);
                            return true;
                        }
                    }
                }
            } else {
                System.out.println("O animal está de barriga cheia");
                return true;
            }
        }
        return true;
    }

    public void insetoChateia(){
        Random r = new Random();
        String[] noises = new String[3];
        noises[0] = "Bzzzz bzzzz";
        noises[1] = "Tic tic tic tic";
        noises[2] = "Pssssssss";
        int randomIndexNoise = r.nextInt(3);
        System.out.println(noises[randomIndexNoise]);
    }

    public void imprimirDetalhesMeioAmbiente(){
        System.out.println("AMBIENTE: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Água: " + this.agua);
        System.out.println();
        System.out.println("ANIMAIS: ");
        for (SerVivo ser : seres){
            ser.imprimirDetalhesSerVivo();
            if (ser instanceof Animal animal) {
                System.out.print("Fome: " + animal.isFome());
                System.out.print("Peso: " + animal.getPesoKg());
                System.out.print("Inteligência: " + animal.getInteligencia());
                System.out.print("Barulho: " + animal.getBarulho());
            } else if (ser instanceof Inseto inseto) {
                System.out.print("Venenoso: " + inseto.isVenenoso());
            } else if (ser instanceof Planta planta) {
                System.out.print("Família: " + planta.getFamilia());
                System.out.print("Grau de Defesa: " + planta.getGrauDefesa());
            }
        }
    }

    public void listarSeres() {
        for (SerVivo s : seres) {
            s.imprimirDetalhesSerVivo();
            System.out.println();
        }
    }


    public void eliminarMetade() {
        // remove metade das plantas
        eliminarMetadeDaClasse(Planta.class);
        // remove metade dos animais
        eliminarMetadeDaClasse(Animal.class);
    }

    private void eliminarMetadeDaClasse(Class<?> classe) {
        List<Integer> indices = indicesDaClasse(classe);
        int metade = indices.size() / 2;
        for (int i = metade - 1; i >= 0; i--) {
            int idx = indices.get(i);
            seres.remove(idx);
        }
    }


    public List<Integer> indicesDaClasse(Class<?> classe) {
        List<Integer> indices = new ArrayList<>();  // aqui o tipo inferido será Integer
        for (int i = 0; i < seres.size(); i++) {
            if (classe.isInstance(seres.get(i))) {
                indices.add(i);
            }
        }
        return indices;
    }



    public void simulador(int dias) {

        Random rand = new Random();

        // ---------- loop over days ----------
        for (int dia = 1; dia <= dias; dia++) {

            /* INÍCIO DO DIA  */
            System.out.println("\n--- Dia " + dia + " ---");
            System.out.println("Um novo dia começa no " + nome + ".");
            listarSeres();                       // <- escreva um método que imprima todos os seres vivos

            // Todos os animais ficam com fome no início do dia
            for (SerVivo s : seres) {
                if (s instanceof Animal a) a.setFome(true);
            }

            /* TRÊS MOMENTOS */
            for (int momento = 0; momento < 3; momento++) {

                int acontecimento = rand.nextInt(4) + 1;   // 1-4

                switch (acontecimento) {

                    /* -------- PLANTA -------- */
                    case 1 -> {
                        ArrayList<Integer> plantas = (ArrayList<Integer>) indicesDaClasse(Planta.class);
                        if (plantas.isEmpty()) break;      // nenhuma planta viva
                        int alvo = plantas.get(rand.nextInt(plantas.size()));

                        switch (rand.nextInt(3)) {
                            case 0 -> plantaAbanaComVento(alvo);
                            case 1 -> plantaBebe(alvo);
                            case 2 -> plantaComeInsetos(alvo);
                        }
                    }

                    /* -------- ANIMAL -------- */
                    case 2 -> {
                        ArrayList<Integer> animais = (ArrayList<Integer>) indicesDaClasse(Animal.class);
                        if (animais.isEmpty()) break;
                        int alvo = animais.get(rand.nextInt(animais.size()));

                        switch (rand.nextInt(3)) {
                            case 0 -> animalFazBarulho(alvo);
                            case 1 -> animalMovimenta(alvo);
                            case 2 -> animalCome(alvo);
                        }
                    }

                    /* -------- INSETO -------- */
                    case 3 -> {
                        ArrayList<Integer> insetos = (ArrayList<Integer>) indicesDaClasse(Inseto.class);
                        if (insetos.isEmpty()) break;
                        int alvo = insetos.get(rand.nextInt(insetos.size()));
                        insetoChateia();
                    }

                    /* -------- CATÁSTROFE -------- */

                    // Seca
                    case 4 -> {
                        switch (rand.nextInt(3)) {
                            case 0 -> {
                                agua /= 2;
                                System.out.println("Seca severa! A água foi reduzida para metade.");
                            }
                            // Chuvas
                            case 1 -> {
                                agua *= 2;
                                System.out.println("Chuvas intensas! A água duplicou.");
                            }
                            // Erupção
                            case 2 -> {
                                eliminarMetade();
                                System.out.println("Erupção vulcânica! Metade das plantas e animais morreram.");
                            }
                        }
                    }
                }
            } // fim dos 3 momentos

            /* FOME AO FIM DO DIA */
            for (int i = seres.size() - 1; i >= 0; i--) {
                SerVivo s = seres.get(i);
                if (s instanceof Animal a && a.isFome()) {
                    // se falhar, o animal morre de fome
                    if (!animalCome(i)) {
                        System.out.println(a.getNome() + " morreu de fome.");
                        seres.remove(i);
                    }
                }
            }
        } // fim do for de dias

        /* RESULTADO FINAL */
        if (seres.isEmpty()) {
            System.out.println("\nTodos morreram.");
        } else {
            System.out.println("\nSobreviveram:");
            listarSeres();
        }
    }

}
