package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1 = lerNota(sc, "Digite a primeira nota do aluno: ");
        double nota2 = lerNota(sc, "Digite a segunda nota do aluno: ");
        double nota3 = lerNota(sc, "Digite a terceira nota do aluno: ");
        double nota4 = lerNota(sc, "Digite a quarta nota do aluno: ");

        double mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média final do aluno é: " + mediaAluno);

        sc.close();
    }

    public static double lerNota(Scanner sc, String mensagem) {
        double nota;
        do {
            System.out.print(mensagem);
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }

}
