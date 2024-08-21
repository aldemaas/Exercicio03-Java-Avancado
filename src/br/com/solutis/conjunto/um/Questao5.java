package br.com.solutis.conjunto.um;

import java.util.Scanner;

import static utils.UtilsConjunto1.getDoubleNaoNegativo;
import static utils.UtilsConjunto1.getQuantidadeMes;

/**
 * @author Vinícius dos Santos Andrade
 */
public class Questao5 {

    /*
    5. Calcule e exiba o valor final de uma dívida. Para isto pergunte ao usuário o valor inicial do
    débito, a quantidade de meses e os juros mensais. Use o cálculo de juros simples.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 5 - Cálculo de dívida com juros simples");
        Scanner entrada = new Scanner(System.in);

        double valorInicial, valorFinal, jurosMensais;
        int quantidadeMeses;

        System.out.print("Digite o valor inicial da dívida (R$): ");
        valorInicial = getDoubleNaoNegativo(entrada);

        System.out.print("Digite a quantidade de meses: ");
        quantidadeMeses = getQuantidadeMes(entrada);

        System.out.print("Digite o juros mensais (%): ");
        jurosMensais = getDoubleNaoNegativo(entrada) / 100;

        valorFinal = montanteComJurosSimples(valorInicial, jurosMensais, quantidadeMeses);
        System.out.printf("O valor final da dívida é: R$%.2f%n", valorFinal);

        entrada.close();
    }

    /**
     * Calcula o valor final de uma dívida com juros simples.
     * <p>
     * A fórmula para calcular os juros simples é expressa por:
     * <p>
     * J = C * i * t
     * <p>
     * Onde:
     * - J: Juros
     * - C: Capital (valor inicial da dívida)
     * - i: taxa de juros. Para substituir na fórmula, a taxa deverá estar na forma decimal (divida a taxa percentual por 100).
     * - t: tempo (em meses). A taxa de juros e o tempo devem estar na mesma unidade de tempo.
     * <p>
     * Podemos ainda calcular o valor total da dívida, o montante, ao final do período.
     * Esse valor é a soma dos juros com o valor inicial (capital).
     * <p>
     * A fórmula do montante é:
     * <p>
     * M = C + J → M = C + C * i * t
     * <p>
     * Simplificando:
     * <p>
     * M = C * (1 + i * t)
     *
     * @param valorInicial    O valor inicial da dívida (C).
     * @param jurosMensais    A taxa de juros mensal (i), em decimal.
     * @param quantidadeMeses A quantidade de meses do período da dívida (t).
     * @return O valor final da dívida (M) após o período especificado.
     */
    public static double montanteComJurosSimples(double valorInicial,
                                                 double jurosMensais,
                                                 int quantidadeMeses) {
        return valorInicial * (1 + jurosMensais * quantidadeMeses);
    }
}
