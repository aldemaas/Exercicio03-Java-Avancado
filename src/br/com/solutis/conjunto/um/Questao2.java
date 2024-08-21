package br.com.solutis.conjunto.um;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Pedro Messias de Lucena Maia
 */
public class Questao2 {

    /*
    2. Determine quantos salários mínimos uma pessoa ganha. Para isso pergunte o salário atual e a
     */

    public static void main(String[] args) {
        System.out.println("Exercício 2 - Salários Mínimos");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double salarioAtual, cotacaoSalarioMinimo, quantidadeDeSalarioMin;

        System.out.println("Informe seu salário atual.");

        salarioAtual = sc.nextDouble();
        if (salarioAtual < 0) {
            System.out.println("O salário atual não pode ser negativo!");
            sc.close();
            return;
        }
        System.out.println("Informe a cotação do salário mínimo.");

        cotacaoSalarioMinimo = sc.nextDouble();
        if (cotacaoSalarioMinimo <= 0) {
            System.out.println("A cotação do salário mínimo não pode ser zero ou negativa!");
            sc.close();
            return;
        }
        quantidadeDeSalarioMin = salarioAtual / cotacaoSalarioMinimo;

        System.out.printf("Então você ganha: %.2f salários mínimos", quantidadeDeSalarioMin);

        sc.close();
    }
}
