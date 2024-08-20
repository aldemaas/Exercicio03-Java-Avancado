package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

/**
 * @author Pedro Emanoel Souza Rocha
 */
public class Questao23 {

    /*
    23. Verifique quem entre duas pessoas faz aniversário primeiro. Exiba o nome do primeiro
    aniversariante considerando que estamos no dia 1 de janeiro. Use como entrada o nome, o
    dia e o mês de nascimento de cada pessoa.
     */

    public static class Pessoa {
        String name;
        int diaDeNasc;
        int mesDeNasc;

        public Pessoa(String name, int diaDeNasc, int mesDeNasc) {
            this.name = name;
            this.diaDeNasc = diaDeNasc;
            this.mesDeNasc = mesDeNasc;
        }
    }

    public static void main(String[] args) {
        System.out.println("Exercício 23 - Comparação de aniversários");
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        int dia1, dia2, mes1, mes2;

        System.out.println("Me informe nome:");
        nome1 = sc.nextLine();
        System.out.println("Me informe dia de nascimento:");
        dia1 = sc.nextInt();
        System.out.println("Me informe mês de nascimento:");
        mes1 = sc.nextInt();
        sc.nextLine();

        System.out.println("---- Agora as pessoas de comparação ----");
        System.out.println("Me informe nome:");
        nome2 = sc.nextLine();
        System.out.println("Me informe dia de nascimento:");
        dia2 = sc.nextInt();
        System.out.println("Me informe mês de nascimento:");
        mes2 = sc.nextInt();

        Pessoa p1 = new Pessoa(nome1, dia1, mes1);
        Pessoa p2 = new Pessoa(nome2, dia2, mes2);

        if (p1.mesDeNasc < p2.mesDeNasc) {
            System.out.println(p1.name + " Faz aniversário primeiro");
        } else if (p1.mesDeNasc > p2.mesDeNasc) {
            System.out.println(p2.name + " Faz aniversário primeiro");
        } else {
            if (p1.diaDeNasc < p2.diaDeNasc) {
                System.out.println(p1.name + " Faz aniversário primeiro");
            } else if (p1.diaDeNasc > p2.diaDeNasc) {
                System.out.println(p2.name + " Faz aniversário primeiro");
            } else {
                System.out.println(p1.name + " e " + p2.name + " faz aniversario no mesmo dia.");
            }
        }

        sc.close();
    }
}
