package conjunto_3_estruturas_de_repeticao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Pedro Messias de Lucena Maia
 */
public class Questao54 {

    /*
    54. Apresente uma tabela de conversão de reais em dólares. Ela deve ser totalmente
    configurável, ou seja o usuário pode informar o valor inicial e final, o valor de incremento e o
    valor de 1 dólar. Apresente os números no formato monetário com duas casas decimais.
     */


    public static void main(String[] args) {
        System.out.println("Exercício 54 - Apresente uma tabela de conversão de reais em dólares.");
        Scanner sc = new Scanner(System.in);

        double valorInicial = 0;
        double valorFinal = 0;
        double incremento = 0;
        double cambio = 0;

        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Informe o valor inicial:");
                valorInicial = Double.parseDouble(sc.nextLine());

                System.out.println("Informe o valor final:");
                valorFinal = Double.parseDouble(sc.nextLine());

                System.out.println("Informe o incremento:");
                incremento = Double.parseDouble(sc.nextLine());

                System.out.println("Informe o câmbio atual (Real/Dólar):");
                cambio = Double.parseDouble(sc.nextLine());

                // Se tudo foi lido de forma correta
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um numero válido.");
            }
        }

        // Criar e imprimir a tabela
        criarTabela(valorInicial, valorFinal, incremento, cambio);

        sc.close();
    }

    public static void criarTabela(double valorInicial, double valorFinal, double incremento, double cambio) {
        Locale.setDefault(Locale.US);
        DecimalFormat formaMonetaria = new DecimalFormat("#,##0.00");

        System.out.printf("%-15s %-20s%n", "Real", "Dólar");
        System.out.println("----------------------------------------");

        for (double valorAtual = valorInicial; valorAtual <= valorFinal; valorAtual += incremento) {
            double dolar = valorAtual / cambio;
            System.out.printf("%-15s %-20s%n", formaMonetaria.format(valorAtual), formaMonetaria.format(dolar));
        }
    }
}
