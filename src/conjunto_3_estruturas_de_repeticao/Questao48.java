package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas para cálculo da média semestral:");
        int quantidadeNotas = sc.nextInt();

        if (quantidadeNotas <= 0) {
            System.out.println("A quantidade de notas deve ser maior que zero.");
            return;
        }

        double somaNotas = 0;

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. As notas devem estar entre 0 e 10.");
                return;
            }

            somaNotas += nota;
        }

        double mediaNotas = somaNotas / quantidadeNotas;

        System.out.println("Digite o total de aulas ministradas no semestre:");
        int totalAulas = sc.nextInt();

        if (totalAulas <= 0) {
            System.out.println("O total de aulas deve ser maior que zero.");
            return;
        }

        System.out.println("Digite o total de faltas do aluno:");
        int totalFaltas = sc.nextInt();

        if (totalFaltas < 0) {
            System.out.println("Total de faltas inválido.");
            return;
        }

        if (mediaNotas >= 7.0 && ((double) (totalAulas - totalFaltas) / totalAulas) >= 0.75) {
            System.out.println("O aluno está aprovado.");
        } else if (mediaNotas < 7.0) {
            System.out.println("O aluno está reprovado por nota.");
        } else {
            System.out.println("O aluno está reprovado por faltas.");
        }

        sc.close();
    }
}
