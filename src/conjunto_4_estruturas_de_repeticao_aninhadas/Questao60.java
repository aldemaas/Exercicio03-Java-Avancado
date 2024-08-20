package conjunto_4_estruturas_de_repeticao_aninhadas;

import java.util.Scanner;

import static utils.UtilsConjunto4.getDoubleNaoNegativo;
import static utils.UtilsConjunto4.getInteiroNaoNegativo;

/**
 * @author Vinícius dos Santos Andrade
 */
public class Questao60 {

    /*
    60. Apresente uma tabela contendo a evolução do valor de uma dívida ao longo dos meses e anos a
    partir de janeiro de 2007. Solicite o valor da dívida, a taxa de correção e a quantidade de anos.

    Por exemplo, para uma dívida de R$ 100,00 ao longo de 2 anos e com uma taxa de correção de 1.8% ao mês:
    Anos   Jan   Fev     Mar    Abr    Mai   Jun    Jul    Ago    Set    Out    Nov    Dez
    2007 100,00 101,80 103,63 105,50 107,40 109,33 111,30 113,30 115,34 117,42 119,53 121,68
    2008 123,87 126,10 128,37 130,68 133,03 135,43 137,87 140,35 142,87 145,45 148,06 150,73
     */

    public static void main(String[] args) {
        System.out.println("Exercício 60 - Evolução de dívida");
        Scanner entrada = new Scanner(System.in);

        double valorInicial, taxaMensal, valorMaximo;
        int quantidadeAnos;

        System.out.print("Digite o valor da dívida inicial: R$ ");
        valorInicial = getDoubleNaoNegativo(entrada);

        System.out.print("Digite a taxa de correção mensal (em porcentagem): ");
        taxaMensal = getDoubleNaoNegativo(entrada) / 100;

        System.out.print("Digite a quantidade de anos: ");
        quantidadeAnos = getInteiroNaoNegativo(entrada);

        // Calcula o valor máximo possível para determinar a largura necessária
        valorMaximo = valorInicial * Math.pow(1 + taxaMensal, 12 * quantidadeAnos);
        int larguraCampo = Math.max(12, String.format("%.2f", valorMaximo).length());

        System.out.println("\nEvolução da dívida:");
        System.out.print("Anos   ");
        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        for (String mes : meses) {
            System.out.printf("%-" + larguraCampo + "s", mes);
        }
        System.out.println();

        imprimirEvolucaoDivida(valorInicial, taxaMensal, quantidadeAnos, larguraCampo);

        entrada.close();
    }

    private static void imprimirEvolucaoDivida(double valorInicial,
                                               double taxaMensal,
                                               int quantidadeAnos,
                                               int larguraCampo) {
        double valorAtual = valorInicial;
        for (int ano = 2007; ano < 2007 + quantidadeAnos; ano++) {
            System.out.printf("%-6d", ano); // Alinhamento à esquerda com 6 espaços
            for (int mes = 1; mes <= 12; mes++) {
                System.out.printf("%-" + larguraCampo + ".2f", valorAtual); // Formatação com largura dinâmica
                valorAtual += valorAtual * taxaMensal;
            }
            System.out.println();
        }
    }
}

