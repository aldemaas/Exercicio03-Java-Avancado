package conjunto_3_estruturas_de_repeticao;

import java.util.Random;

public class Questao34 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <= 50; i++) {
            int numeroSorteado = random.nextInt(100) + 1;
            System.out.println("Número sorteado " + i + ": " + numeroSorteado);
        }
    }
}
