package br.com.solutis.conjunto.tres;

import java.math.BigInteger;

public class Questao52 {
    //52. A história do rei que e tornou pobre: após perder uma aposta com um súdito, ele teve que
    //pagar uma quantia muito grande em sacos de arroz. A aposta feita anteriormente era que
    //se o súdito ganhasse o rei teria que pagar um grão de arroz colocado na primeira casa de
    //um tabuleiro de xadrez. Na segunda casa teria que pagar o dobro, ou seja, dois grãos de
    //arroz, e assim sucessivamente até a casa número 64. Exiba quantos grãos de arroz este
    //súdito teria que ganhar, somando todas as 64 casas.
    //Depois tente exibir a quantia de sacos de arroz?
    public static void main(String[] args) {
        double soma;
        double graosArroz = 0;
        for (int i = 0; i < 64; i++) {
            soma = Math.pow(2, i);
            graosArroz += soma;

        }
        System.out.println("Quantidade final das 64 casas de arroz: " + graosArroz);

        double capacidadeSacoArroz = 15000;
        double totalSacos = capacidadeSacoArroz / graosArroz;
        if (totalSacos % capacidadeSacoArroz != 0) {
            totalSacos += 1;
        }
        System.out.println("Quantidade esperada: " + totalSacos + " baseado em uma capacidade de " +
                "15 mil grãos de arroz por saco");
    }
}
