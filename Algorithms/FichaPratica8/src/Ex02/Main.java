package Ex02;

public class Main {
    public static void main(String[] args){
        // instância da classe
        Edificio edificio1 = new Edificio("Rua da alegria", "Porto",
                "Salmão", 3, true);

        System.out.println(edificio1.getRua() +
                " , " + edificio1.getCidade() +
                " , " + edificio1.getCorDaFachada() +
                " , " + edificio1.getnumAndares() +
                " , " + edificio1.getGaragem());

        edificio1.setCorDaFachada("azul");

        System.out.println(edificio1.getRua() +
                " , " + edificio1.getCidade() +
                " , " + edificio1.getCorDaFachada() +
                " , " + edificio1.getnumAndares() +
                " , " + edificio1.getGaragem());

        // edificio1.setRua("Rua da Silva");
    }
}
