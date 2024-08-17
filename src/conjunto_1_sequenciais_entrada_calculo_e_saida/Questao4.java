package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite a quarta nota do aluno: ");
        double nota4 = sc.nextDouble();

        double mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média final do aluno é: " + mediaAluno);

    }

}
