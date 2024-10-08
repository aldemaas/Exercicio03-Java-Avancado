package br.com.solutis.conjunto.tres;

import java.util.Scanner;

/**
 * @author Pedro Emanoel Souza Rocha
 */
public class Questao55 {

    /*
    55. A operadora de celular Vai-Vai possui um plano com o valor mensal de 50,00 que permite
    100 minutos por mês para qualquer número. Além disso, ela oferece 50 minutos a mais
    para ligações destinadas a um número da própria Vai-Vai. Ainda neste plano ela tem uma
    promoção onde cada minuto gasto para telefone fixo consome somente a metade. O valor
    do minuto excedente para outras operadoras é de 0.65, e para a própria Vai-Vai é 0.20.
    Faça um programa que permita ao usuário entrar com o tipo de ligação (‘o’ = outras
    operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo) e a quantidade de minutos. A cada
    entrada, deve-se informar o quanto que ele tem de saldo e o valor a pagar. Faça isto
    enquanto ele indicar que existem mais ligações a serem digitadas.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 55 - Calculo de valor de ligação.");
        Scanner sc = new Scanner(System.in);

        double valorMensal = 50.00;
        double minMensal = 100;
        double minBonus = 50;

        System.out.println("tipo de ligação (‘o’ = outras\n" +
                "operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo) e depois a quantidade de " +
                "minutos");
        String s_n;

        do {
            System.out.println("Tipo de ligação:");
            String ligacao = sc.nextLine();
            System.out.println("Minutos");
            double min = sc.nextDouble();
            while (min < 0) {
                System.out.println("Valor invalido! valor menor ou igual zero");
                min = sc.nextDouble();
            }
            if (ligacao.equals("v")) {
                if (min > minBonus && minBonus > 0) {
                    min = min - minBonus;
                    minBonus = 0;
                    if (min > minMensal) {
                        double aux = min - minMensal;
                        minMensal = 0;
                        valorMensal = valorMensal + (aux * 0.20);
                        System.out.printf("Disponivel ainda %.2f minutos e %.2f minutos bonus,\nvalor a pagar %.2f\n",
                                minMensal, minBonus, valorMensal);
                        System.out.println("Gostaria de outra ligação s - sim e n - não");
                        sc.nextLine();
                        s_n = sc.nextLine();
                        continue;
                    }
                    minMensal = minMensal - min;
                    System.out.printf("Disponivel ainda %.2f minutos e %.2f minutos bonus,\nvalor a pagar %.2f\n",
                            minMensal, minBonus, valorMensal);
                    System.out.println("Gostaria de outra ligação s - sim e n - não");
                    sc.nextLine();
                    s_n = sc.nextLine();
                    continue;
                }
                if (minBonus > 0) {
                    minBonus = minBonus - min;
                    System.out.printf("Disponivel ainda %.2f minutos e %.2f minutos bonus,\nvalor a pagar %.2f\n",
                            minMensal, minBonus, valorMensal);
                    System.out.println("Gostaria de outra ligação s - sim e n - não");
                    sc.nextLine();
                    s_n = sc.nextLine();
                    continue;
                }
                if (minMensal > 0) {
                    if (min > minMensal) {
                        double aux = min - minMensal;
                        minMensal = 0;
                        valorMensal = valorMensal + (aux * 0.20);
                    }
                } else {
                    valorMensal = valorMensal + (min * 0.20);
                }
            }
            if (ligacao.equals("o")) {
                if (minMensal > 0) {
                    if (min >= minMensal) {
                        double aux = min - minMensal;
                        minMensal = 0;
                        valorMensal = valorMensal + (aux * 0.65);
                    } else {
                        minMensal = minMensal - min;
                    }
                } else {
                    valorMensal = valorMensal + (min * 0.65);
                }
            }
            if (ligacao.equals("f")) {
                double minTele = min / 2;
                if (minMensal > 0) {
                    if (minTele >= minMensal) {
                        double aux = minTele - minMensal;
                        minMensal = 0;
                        valorMensal = valorMensal + (aux * 0.65);
                    } else {
                        minMensal = minMensal - minTele;
                    }
                } else {
                    valorMensal = valorMensal + (minTele * 0.65);
                }
            }
            System.out.printf("Disponivel ainda %.2f minutos e %.2f minutos bonus,\nvalor a pagar %.2f",
                    minMensal, minBonus, valorMensal);
            System.out.println();
            System.out.println("Gostaria de outra ligação s - sim e n - não");
            sc.nextLine();
            s_n = sc.nextLine();

        } while (s_n.equals("s"));
        sc.close();
    }
}
