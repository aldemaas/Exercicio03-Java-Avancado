package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Locale;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu salário atual.");

        double salarioAtual = sc.nextDouble();
        if (salarioAtual < 0){
            System.out.println("O salário atual não pode ser negativo!");
            sc.close();
            return;
        }
        System.out.println("Informe a cotação do salário mínimo.");

        double cotacaoSalarioMinimo = sc.nextDouble();
        if (cotacaoSalarioMinimo <= 0) {
            System.out.println("A cotação do salário mínimo não pode ser zero ou negativa!");
            sc.close();
            return;
        }
        double quantidadeDeSalarioMin = salarioAtual / cotacaoSalarioMinimo;

        System.out.printf("Então você ganha: %.2f salários mínimos", quantidadeDeSalarioMin);

        sc.close();
    }
}
