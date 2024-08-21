package br.com.solutis.conjunto.tres;

import java.util.Scanner;

/**
 * @author Pedro Emanoel Souza Rocha
 */
public class Questao56 {

    /*
    56. Crie um programa para simular uma urna de votação para exatamente 3 candidatos. Logo
    no início deve-se perguntar ao usuário os nomes dos candidatos. Permita votos em branco.
    Ao término de toda a entrada, apresente o nome, a quantidade de votos e o percentual de
    cada candidato. Apresente também a quantidade e o percentual dos votos em branco e
    quem foi o ganhador da eleição.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 56 - Simulação de urna de votação.");
        Scanner sc = new Scanner(System.in);

        double aux, porBra, porPri, porSeg, porTer;
        int bra, pri, seg, ter, votacao, auxInt;
        String[] candidatos;
        String votar;

        System.out.println("Informe o nome dos candidatos:");
        candidatos = new String[4];
        candidatos[3] = "Branco";

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "º candidato");
            candidatos[i] = sc.nextLine();
        }
        System.out.println("--------------------------");

        bra = 0;
        pri = 0;
        seg = 0;
        ter = 0;
        votar = "s";

        while (votar.equals("s")) {
            System.out.println("Escolha em que votar\n0 para " + candidatos[3]
                    + ":\n1 para o candidato " + candidatos[0]
                    + ":\n2 para o candidato " + candidatos[1]
                    + ":\n3 para o candidato " + candidatos[2] + ":");
            votacao = sc.nextInt();

            switch (votacao) {
                case 0 -> bra++;
                case 1 -> pri++;
                case 2 -> seg++;
                case 3 -> ter++;
                default -> System.out.println("Opção invalida!");
            }

            sc.nextLine();

            System.out.println("Caso tenho proximo eleitor tecle 's' no caso de não 'n':");
            votar = sc.nextLine();
            if (votar.equals("n")) {
                aux = bra + pri + seg + ter;
                porBra = (bra * 100) / aux;
                System.out.printf("Total de votos em Brancos %d que equivale %.2f%% dos votos\n", bra, porBra);
                porPri = (pri * 100) / aux;
                System.out.printf("Total de votos para %s %d que equivale %.2f%% dos votos\n", candidatos[0],
                        pri, porPri);
                porSeg = (seg * 100) / aux;
                System.out.printf("Total de votos para %s %d que equivale %.2f%% dos votos\n", candidatos[1],
                        seg, porSeg);
                porTer = (ter * 100) / aux;
                System.out.printf("Total de votos para %s %d que equivale %.2f%% dos votos\n", candidatos[2],
                        ter, porTer);
                auxInt = (int) aux;
                System.out.println("Total de votos apurados: " + auxInt);
            }
        }
        sc.close();
    }
}
