package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Digite o valor dos descontos: ");
        double descontos = sc.nextDouble();

        System.out.print("Digite o valor do empréstimo desejado: ");
        double valorEmprestimo = sc.nextDouble();

        double salarioLiquido = salarioBruto - descontos;

        double valorMaximoEmprestimo = salarioLiquido * 0.3;

        if (valorEmprestimo <= valorMaximoEmprestimo) {
            System.out.println("Você pode solicitar o empréstimo.");
        } else {
            System.out.println("Infelizmente, o valor do empréstimo excede o limite permitido.");
        }
        sc.close();
    }
}
