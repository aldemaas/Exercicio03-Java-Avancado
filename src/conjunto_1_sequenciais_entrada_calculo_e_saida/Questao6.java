package conjunto_1_sequenciais_entrada_calculo_e_saida;

/**
 * @author Kauê Alexandre dos Reis Santos
 */
public class Questao6 {

    /*
    6. Calcule e exiba área ocupada por um círculo cujo raio mede 5 metros.
    A área de um círculoé Pi multiplicado pelo raio elevado ao quadrado.
    Em Java o valor de pi está disponível em Math.PI
     */

    public static void main(String[] args) {
        System.out.println("Exercício 6 - Área do círculo");

        double raio, area;

        raio = 5.0;
        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area + " metros quadrados.");
    }
}
