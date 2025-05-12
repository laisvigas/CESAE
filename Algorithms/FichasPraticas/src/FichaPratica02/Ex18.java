package FichaPratica02;
import java.util.Scanner;

// A empresa "XPTO, Lda." voltou a contactá-lo no sentido de adaptar o programa anteriormente
// feito as novas alterações fiscais. Tendo em conta os dados a seguir descritos,
// elabore uma nova versão do programa que permite calcular o vencimento de um colaborador,
// bem como os descontos e impostos decorrentes desse processamento salarial Conceitos:
// a. Cargo: E-Empregado, C-Chefe, A-Administrador
// b. Vencimento base: E-40€/dia, C-60€/dia e A-80€/dia
// c. Subsídio de alimentação: 5€/dia para os empregados e 7,5€/dia para os chefes e administradores.
// d. Retenção de IRS:
// i. 10% se vencimento do mês inferior a 1000€
// ii. 20% se vencimento do mês superior a 1000€
// e. Segurança Social:
// i. Administradores - 9% encargo do funcionário e 21% encargo da entidade patronal
// ii. Outros - 11% encargo do funcionário e 23,75% encargo da entidade patronal
// Deve ser solicitado ao utilizador o código do funcionário bem como o seu cargo,
// e o número de dias que ele trabalhou nesse mês. Deverá depois apresentar:
// a. o valor ilíquido a receber fruto do vencimento.
// b. total subsídio de alimentação.
// c. valor da retenção de IRS a entregar ao estado.
// d. valor total a entregar à Segurança Social (ambos os encargos)
// e. valor líquido a receber pelo funcionário.

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String codigoFuncionario, cargo;
        int diasTrabalhados;
        double vencimentoDiario = 0;
        double subsidioAlimentacaoDiario = 0;

        System.out.print("Digite o código do funcionário: ");
        codigoFuncionario = input.nextLine();

        System.out.print("Digite o cargo (E - Empregado, C - Chefe, A - Administrador): ");
        cargo = input.nextLine().toUpperCase();

        System.out.print("Digite o número de dias trabalhados no mês: ");
        diasTrabalhados = input.nextInt();

        // determina vencimento e subsídio de alimentação com base no cargo
        switch (cargo) {
            case "E":
                vencimentoDiario = 40;
                subsidioAlimentacaoDiario = 5;
                break;
            case "C":
                vencimentoDiario = 60;
                subsidioAlimentacaoDiario = 7.5;
                break;
            case "A":
                vencimentoDiario = 80;
                subsidioAlimentacaoDiario = 7.5;
                break;
            default:
                System.out.println("Cargo inválido!");
                return;
        }

        double vencimentoMensal = vencimentoDiario * diasTrabalhados;
        double subsidioAlimentacao = subsidioAlimentacaoDiario * diasTrabalhados;

        // retenção de IRS
        double irs = (vencimentoMensal < 1000) ? vencimentoMensal * 0.10 : vencimentoMensal * 0.20;

        // segurança Social
        double ssFuncionario, ssEntidade;

        if (cargo.equals("A")) {
            ssFuncionario = vencimentoMensal * 0.09;
            ssEntidade = vencimentoMensal * 0.21;
        } else {
            ssFuncionario = vencimentoMensal * 0.11;
            ssEntidade = vencimentoMensal * 0.2375;
        }

        double totalSegurancaSocial = ssFuncionario + ssEntidade;

        // valor líquido a receber
        double valorLiquido = vencimentoMensal + subsidioAlimentacao - irs - ssFuncionario;

        System.out.println("--- Recibo de Salário ---");
        System.out.println("Código do funcionário: " + codigoFuncionario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Vencimento ilíquido: €" + vencimentoMensal);
        System.out.println("Subsídio de alimentação: €" + subsidioAlimentacao);
        System.out.println("Retenção de IRS: €" + irs);
        System.out.println("Total Segurança Social (funcionário + entidade): €" + totalSegurancaSocial);
        System.out.println("Valor líquido a receber: €" + valorLiquido);
    }
}