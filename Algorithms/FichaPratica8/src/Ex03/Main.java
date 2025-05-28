package Ex03;

public class Main {
    public static void main(String[] args){
        Retangulo retangulo1 = new Retangulo("verde", 20, 30);
        System.out.println("Perímetro: " + retangulo1.calcularPerimetro());
        System.out.println("Área: " + retangulo1.calcularArea());
    }
}
