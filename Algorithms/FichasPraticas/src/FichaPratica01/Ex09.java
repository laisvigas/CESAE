package FichaPratica01;

// Foi contactado pela empresa 'XPTO, Lda.' para a elaboração de um programa
// que permita calcular o vencimento de um colaborador,
// bem como os descontos e impostos decorrentes desse processamento salarial.
// Conceitos:
//      a. Vencimento base: 40€/dia
//      b. Subsídio de alimentação: 5€/dia.
//      c. Retenção de IRS: 10%
//      d. Segurança Social: 11% encargo do funcionário e 23,75% encargo da entidade patronal.
// Deve ser solicitado ao utilizador o código do funcionário,
// e o número de dias que ele trabalhou nesse mês. Deverá depois apresentar:
//      a. o valor ilíquido a receber fruto do vencimento.
//      b. total subsídio de alimentação
//      c. valor da retenção de IRS a entregar ao estado.
//      d. valor total a entregar à Segurança Social (ambos os encargos).
//      e. valor líquido a receber pelo funcionário.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputCodigoFuncionario, inputNumeroDiasTrabalhadosMes;
        int vencimentoBase = 40;
        int subsidioAlimentacao = 5;
        double IRS = 10;
        double segurancaSocialEncargoFuncionario = 11;
        double segurancaSocialEncargoEntidadePatronal = 23.75f;

        double segurancaSocialTotal;

        double valorIliquidoReceber, valorSubsidioAlimentacao,
                valorRetencaoIRS, valorLiquidoReceber;


        System.out.print("Introduza o código do funcionário: ");
        inputCodigoFuncionario = input.nextInt();

        System.out.print("Introduza o número de dias que o funcionário trabalhou: ");
        inputNumeroDiasTrabalhadosMes = input.nextInt();

        // a. total subsídio de alimentação
        valorSubsidioAlimentacao = inputNumeroDiasTrabalhadosMes * subsidioAlimentacao;

        // b. o valor ilíquido a receber fruto do vencimento.
        valorIliquidoReceber = (vencimentoBase * inputNumeroDiasTrabalhadosMes) + valorSubsidioAlimentacao;

        // c. valor da retenção de IRS a entregar ao estado.
        valorRetencaoIRS = valorIliquidoReceber * IRS / 100;

        // d. valor total a entregar à Segurança Social (ambos os encargos).
        segurancaSocialTotal = (valorIliquidoReceber * segurancaSocialEncargoFuncionario / 100)
                + (valorIliquidoReceber * segurancaSocialEncargoEntidadePatronal / 100);

        // e. valor líquido a receber pelo funcionário.
        valorLiquidoReceber = valorIliquidoReceber - (valorIliquidoReceber * segurancaSocialEncargoFuncionario / 100) - valorRetencaoIRS;

        System.out.println("Código do Funcionário: " + inputCodigoFuncionario);
        System.out.println("Ilíquido: " + valorIliquidoReceber);
        System.out.println("Subsídio alimentação: " + valorSubsidioAlimentacao);
        System.out.println("Retenção IRS: " + valorRetencaoIRS);
        System.out.println("Segurança Social Total: " + segurancaSocialTotal);
        System.out.println("Líquido: " + valorLiquidoReceber);
    }
}
