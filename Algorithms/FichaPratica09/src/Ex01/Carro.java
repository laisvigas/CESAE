package Ex01;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double consumoLitros100Km;

    public Carro(String marca, String modelo, String cor, int anoFabricacao, int potencia,
                 int cilindrada, TipoCombustivel tipoCombustivel, double consumoLitros100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.consumoLitros100Km = consumoLitros100Km;
    }

    public String getMarca() {
        return marca;
    }

    public String ligar(){
        if (this.anoFabricacao > 30) {
            if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)){
                return "Deita um pouco de fumo... Custa a pegar... O carro está ligado! Vrum-vrum-vrum!";
            } else {
                return "Custa a pegar... O carro está ligado! Vrum-vrum-vrum!";
            }
        } else {
            if (this.potencia < 250){
                return "O carro está ligado! Vruuuuuum!";
            } else {
                return "O CARRO ESTÁ LIGADO! VRUUUM!";
            }
        }
    }

    // Crie um método corrida que recebe um adversário por parâmetro e retorna o Carro vencedor.
    //  O vencedor é o carro com mais potência (caso seja a mesma o fator de desempate é a cilindrada (o maior ganha),
    //  caso contrário o fator de desempate é a idade (o mais recente ganha), caso contrário temos empate).

    public Carro adversario(Carro carroAdversario) {
        Carro vencedor = null;
        if (this.potencia > carroAdversario.potencia){
            vencedor = this;
        } else {
            if (this.potencia == carroAdversario.potencia) {
                if (this.cilindrada > carroAdversario.cilindrada) {
                    vencedor = this;
                }
            } else {
                if (this.cilindrada == carroAdversario.cilindrada) {
                    if (this.anoFabricacao > carroAdversario.anoFabricacao) {
                        vencedor = this;
                    }
                } else {
                    vencedor = carroAdversario;
                }
            }
        }
        return vencedor;
    }

    public String exibirDetalhes(){
        return "CARRO:\n" + "Marca: " + this.marca + " | Modelo: " + this.modelo + " " + "| Cor: " + this.cor
                + "\nAno de Fabricação: " + this.anoFabricacao + " | Potência: " + this.potencia + " | Cilindrada: " + this.cilindrada
                + "\nTipo de Combustível: " + this.tipoCombustivel + " | Consumo 100/Km: " + this.consumoLitros100Km;
    }

    public double calcularConsumo(double distanciaEmKm){
         return distanciaEmKm;
    }
}
