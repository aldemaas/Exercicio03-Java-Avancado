package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

/**
 *  @author Kauê Alexandre dos Reis Santos
 */
public class Questao3 {

    /*
    3. Solicite a quantidade de homens e de mulheres de uma turma da faculdade. Em seguida
    calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.

    Obs.: em Java a divisão de valores inteiros dá como resultado um número inteiro, ao menos
    que um dos números seja do tipo ponto flutuante (double, por exemplo). Para transformar
    inteiro para double basta fazer um cast: “(double)x” - transforma “x” em double.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 4 - Percentual ");
        Scanner sc = new Scanner(System.in);

        int qtdHomens, qtdMulheres, total;
        double percentualHomens, percentualMulheres;

        System.out.print("Digite a quantidade de homens: ");
        qtdHomens = sc.nextInt();

        System.out.print("Digite a quantidade de mulheres: ");
        qtdMulheres = sc.nextInt();

        total = qtdHomens + qtdMulheres;

        percentualHomens = ((double) qtdHomens / total) * 100;
        percentualMulheres = ((double) qtdMulheres / total) * 100;

        System.out.printf("Percentual de homens: %.2f%%%n", percentualHomens);
        System.out.printf("Percentual de mulheres: %.2f%%%n", percentualMulheres);

        sc.close();
    }
}
