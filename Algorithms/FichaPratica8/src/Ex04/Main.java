package Ex04;

public class Main {
    public static void main(String[] args){
        Circulo circulo1 = new Circulo("verde", 2);

        System.out.println("A área do círculo é: " + circulo1.calcularArea());
        System.out.println("O perímetro do círculo é: " + circulo1.calcularPerimetro());
    }
}
