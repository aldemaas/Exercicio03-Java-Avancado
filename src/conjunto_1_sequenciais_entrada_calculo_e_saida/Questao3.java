package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de homens: ");
        int homens = sc.nextInt();

        System.out.print("Digite a quantidade de mulheres: ");
        int mulheres = sc.nextInt();

        int total = homens + mulheres;

        double percentualHomens = ((double) homens / total) * 100;
        double percentualMulheres = ((double) mulheres / total) * 100;

        System.out.printf("Percentual de homens: %.2f%%%n", percentualHomens);
        System.out.printf("Percentual de mulheres: %.2f%%%n", percentualMulheres);
        sc.close();
    }
}
