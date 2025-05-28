package Ex05;

public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro("Fusca", "1", "verde", 1970);
        Carro carro2 = new Carro("Fusca", "2", "branco", 1950);


        System.out.println(carro1.ligar());
        System.out.println(carro2.ligar());
    }
}
