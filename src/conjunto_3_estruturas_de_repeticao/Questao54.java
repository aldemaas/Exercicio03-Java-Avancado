package conjunto_3_estruturas_de_repeticao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;



public class Questao54 {
    public static void criarTabela(double valorInicial, double valorFinal, double incremento, double cambio) {
        Locale.setDefault(Locale.US);
        DecimalFormat formaMonetaria = new DecimalFormat("#,##0.00");

        System.out.printf("%-15s %-20s%n", "Real", "Dólar");
        System.out.println("----------------------------------------");

        for(double valorAtual = valorInicial; valorAtual <= valorFinal; valorAtual += incremento) {
            double dolar = valorAtual / cambio;
            System.out.printf("%-15s %-20s%n", formaMonetaria.format(valorAtual), formaMonetaria.format(dolar));
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valorInicial = 0;
        double valorFinal = 0;
        double incremento = 0;
        double cambio = 0;

        boolean entradaValida = false;

        while(!entradaValida) {
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
        Questao54.criarTabela(valorInicial, valorFinal, incremento, cambio);


        sc.close();
    }
}
