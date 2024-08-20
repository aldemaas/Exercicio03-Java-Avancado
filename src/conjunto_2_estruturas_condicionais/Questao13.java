package conjunto_2_estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Pedro Messias de Lucena Maia
 */
public class Questao13 {

    /*
    13. Acrescente no problema anterior possibilidade dele fazer prova final em caso de
    recuperação. Neste caso a nota de aprovação passa a ser >= 5.0
     */

    public static void main(String[] args) {
        System.out.println("Exercício 13 - Aprovação, recuperação ou reprovação com prova final");
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
            System.out.println("Você está de recuperação. Terá de fazer a prova final");
            System.out.println("Qual foi a nota da prova final?");
            double provaFinal = sc.nextDouble();
            // Validação da prova final
            if (provaFinal < 0 || provaFinal > 10) {
                System.out.println("Nota da prova final inválida. As notas devem estar entre 0 e 10.");
                return;
            } else if (provaFinal >= 5.0) {
                System.out.println("Parabéns, você foi aprovado!");
                return;
            } else {
                System.out.println("Você está reprovado.");
                return;
            }
        } else {
            System.out.println("Você foi reprovado.");
        }

        sc.close();
    }
}
