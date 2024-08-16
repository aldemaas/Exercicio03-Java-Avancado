package conjunto_4_estruturas_de_repeticao_aninhadas;

import java.util.Scanner;

import static Utils.UtilsConjunto4.getDoubleNaoNegativo;
import static Utils.UtilsConjunto4.getInteiroNaoNegativo;

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

        double valorInicial, taxaMensal, valorAtual;
        int quantidadeAnos;

        System.out.print("Digite o valor da dívida inicial: R$ ");
        valorInicial = getDoubleNaoNegativo(entrada);

        System.out.print("Digite a taxa de correção mensal (em porcentagem): ");
        taxaMensal = getDoubleNaoNegativo(entrada) / 100;

        System.out.print("Digite a quantidade de anos: ");
        quantidadeAnos = getInteiroNaoNegativo(entrada);

        System.out.println("\nEvolução da dívida:");
        System.out.println("Anos   Jan     Fev     Mar     Abr     Mai     Jun     Jul     Ago     Set     Out     Nov     Dez");

        valorAtual = valorInicial;
        for (int ano = 2007; ano < 2007 + quantidadeAnos; ano++) {
            System.out.printf("%-4d ", ano); // Alinhamento à esquerda com 4 espaços
            for (int mes = 1; mes <= 12; mes++) {
                System.out.printf("%7.2f ", valorAtual); // Alinhamento à direita com 7 espaços e 2 casas decimais
                valorAtual += valorAtual * taxaMensal;
            }
            System.out.println();
        }

        entrada.close();
    }
}

