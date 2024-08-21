package br.com.solutis.conjunto.dois;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Pedro Messias de Lucena Maia
 */
public class Questao12 {

    /*
    12. A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de
    recuperação ou foi reprovado. A média de aprovação é >= 7.0; a média de recuperação é
    >= 5.0 e < 7.0; e a média do reprovado é < 5.0
     */

    public static void main(String[] args) {
        System.out.println("Exercício 12 - Aprovação, recuperação ou reprovação");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double n1, n2, n3, media;

        System.out.println("Olá aluno, forneça suas 3 notas.");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        media = (n1 + n2 + n3) / 3.0;

        //Validação das notas
        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10) {
            System.out.println("Notas inválidas. As notas devem estar entre 0 e 10.");
        } else if (media >= 7.0) {
            System.out.println("Parabéns, você foi aprovado!");
        } else if (media >= 5.0) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Você foi reprovado.");
        }

        sc.close();
    }
}
