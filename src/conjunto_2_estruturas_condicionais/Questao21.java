package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o cargo do funcionário (Diretoria, Gerência, Operacional): ");
        String cargo = sc.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        double emprestimoPossivel;
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
