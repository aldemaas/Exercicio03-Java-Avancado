package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da comanda:");
        double comanda = sc.nextDouble();
        double comissao = comanda * 1.1;

        System.out.printf("Valor dos gastos foi: %.2f\n" +
                "com um adicional do garçom de 10%% a conta fica %.2f",comanda,comissao);

        sc.close();
    }
}
