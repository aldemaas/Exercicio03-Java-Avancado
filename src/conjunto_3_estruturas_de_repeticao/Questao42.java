package conjunto_3_estruturas_de_repeticao;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Aldemir Carlos Alves de Lima
 */
public class Questao42 {

    /*
    42. Aproveitando o algoritmo do exercício anterior, exiba uma lista de 40 grupos de números
    sorteados de 0 a 59. Cada grupo possui 3 números e deve exibido em ordem crescente.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 42 - Exiba uma lista de 40 grupos de números sorteados de 0 a 59. Cada grupo possui 3 números e deve ser exibido em ordem crescente.");
        Random random = new Random();

        System.out.println("Estes são os 40 grupos de números sorteados:");

        for (int i = 1; i <= 40; i++) {
            int[] grupo = new int[3];

            for (int j = 0; j < 3; j++) {
                grupo[j] = random.nextInt(60);
            }

            Arrays.sort(grupo);
            System.out.printf("Grupo %02d: %02d, %02d, %02d%n", i, grupo[0], grupo[1], grupo[2]);
        }
    }
}
