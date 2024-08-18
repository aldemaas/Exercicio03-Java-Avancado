package conjunto_2_estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá aluno, forneça suas 3 notas.");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1 + n2 + n3) / 3.0;
        //Validação das notas
        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10) {
            System.out.println("Notas inválidas. As notas devem estar entre 0 e 10.");
        } else if (media >= 7.0) {
            System.out.println("Parabéns, você foi aprovado!");
        } else if (media >= 5.0) {
            System.out.println("Você está de recuperação. Terá de fazer a prova final");
        }
        else{
            System.out.println("Você foi reprovado.");
        }

        sc.close();
    }
}
