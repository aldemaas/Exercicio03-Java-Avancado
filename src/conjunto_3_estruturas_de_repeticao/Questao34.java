package conjunto_3_estruturas_de_repeticao;

import java.util.Random;

/**
 * @author Suerdo Flaubert Campos de Lucena Júnior
 */
public class Questao34 {

    /*
    34. Exiba 50 números sorteados de 1 a 100 para o usuário.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 34 - Exiba 50 números sorteados de 1 a 100 para o usuário.");
        Random random = new Random();

        for (int i = 1; i <= 50; i++) {
            int numeroSorteado = random.nextInt(100) + 1;
            System.out.println("Número sorteado " + i + ": " + numeroSorteado);
        }
    }
}
