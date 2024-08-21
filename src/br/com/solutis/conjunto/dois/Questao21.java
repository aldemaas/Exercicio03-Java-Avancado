package br.com.solutis.conjunto.dois;

import java.util.Scanner;

/**
 * @author Kauê Alexandre dos Reis Santos
 */
public class Questao21 {

    /*
    21. Exiba o valor do empréstimo possível para um funcionário de uma empresa.
    Sabe-se:
    Cargo % do
    salário
    Diretoria 30%
    Gerência 25%
    Operacional 20%
     */

    public static void main(String[] args) {
        System.out.println("Exercício 21 - Empréstimo");
        Scanner sc = new Scanner(System.in);

        String cargo;
        double salario, emprestimoPossivel;

        System.out.print("Digite o cargo do funcionário (Diretoria, Gerência, Operacional): ");
        cargo = sc.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        salario = sc.nextDouble();

        switch (cargo.toLowerCase()) {
            case "diretoria" -> emprestimoPossivel = salario * 0.30;
            case "gerência" -> emprestimoPossivel = salario * 0.25;
            case "operacional" -> emprestimoPossivel = salario * 0.20;
            default -> {
                System.out.println("Cargo não reconhecido. Por favor, insira um cargo válido.");
                return;
            }
        }

        System.out.printf("O valor do empréstimo possível é: R$ %.2f%n", emprestimoPossivel);

        sc.close();
    }
}
