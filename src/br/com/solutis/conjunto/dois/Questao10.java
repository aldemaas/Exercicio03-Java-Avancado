package br.com.solutis.conjunto.dois;

import java.util.Scanner;

/**
 * @author Suerdo Flaubert Campos de Lucena Júnior
 */
public class Questao10 {

    /*
    10. Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu
    salário liquido. Receba o valor do salário bruto, o valor dos descontos e o valor do possível
    empréstimo de um cliente, em seguida avise se ele poderá ou não fazer o empréstimo.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 10 - Verifique se o cliente pode fazer um empréstimo.");
        Scanner sc = new Scanner(System.in);

        double salarioBruto, descontos, valorEmprestimo,
                salarioLiquido, valorMaximoEmprestimo;

        System.out.print("Digite o valor do seu salário bruto: ");
        salarioBruto = sc.nextDouble();

        System.out.print("Digite o valor dos descontos: ");
        descontos = sc.nextDouble();

        System.out.print("Digite o valor do empréstimo desejado: ");
        valorEmprestimo = sc.nextDouble();

        salarioLiquido = salarioBruto - descontos;
        valorMaximoEmprestimo = salarioLiquido * 0.3;

        if (valorEmprestimo <= valorMaximoEmprestimo) {
            System.out.println("Você pode solicitar o empréstimo.");
        } else {
            System.out.println("Infelizmente, o valor do empréstimo excede o limite permitido.");
        }

        sc.close();
    }
}
