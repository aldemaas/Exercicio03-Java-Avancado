package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

import static utils.UtilsConjunto2.*;

/**
 * @author Vinícius dos Santos Andrade
 */
public class Questao25 {

    /*
    25. Valide um horário composto de horas, minutos e segundos.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 25 - Validação de horário (hh:mm:ss)");
        Scanner entrada = new Scanner(System.in);

        byte horas, minutos, segundos;

        System.out.print("Digite as horas: ");
        horas = getHora(entrada);

        System.out.print("Digite os minutos: ");
        minutos = getMinuto(entrada);

        System.out.print("Digite os segundos: ");
        segundos = getSegundo(entrada);

        if (horas >= 0 && horas <= 23 &&
                minutos >= 0 && minutos <= 59 &&
                segundos >= 0 && segundos <= 59) {
            System.out.println("Horário válido.");
        } else {
            System.out.println("Horário inválido.");
        }

        entrada.close();
    }
}
