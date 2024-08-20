package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

/**
 * @author Pedro Emanoel Souza Rocha
 */
public class Questao7 {

    /*
     7. Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da
     despesa de um cliente.
     */

    public static void main(String[] args) {
        System.out.println("7 - Gorjeta do garçom");
        Scanner sc = new Scanner(System.in);

        double comanda, comissao;

        System.out.println("Informe o valor da comanda:");
        comanda = sc.nextDouble();

        comissao = comanda * 1.1;

        System.out.printf("Valor dos gastos foi: %.2f\n" +
                "com um adicional do garçom de 10%% a conta fica %.2f", comanda, comissao);

        sc.close();
    }
}
