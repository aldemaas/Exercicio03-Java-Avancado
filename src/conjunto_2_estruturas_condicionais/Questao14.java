package conjunto_2_estruturas_condicionais;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {

        Map<String, Integer> meses = new HashMap<>();
        meses.put("janeiro", 1);
        meses.put("fevereiro", 2);
        meses.put("março", 3);
        meses.put("abril", 4);
        meses.put("maio", 5);
        meses.put("junho", 6);
        meses.put("julho", 7);
        meses.put("agosto", 8);
        meses.put("setembro", 9);
        meses.put("outubro", 10);
        meses.put("novembro", 11);
        meses.put("dezembro", 12);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome de um mês específico: ");
        String mes = sc.nextLine().trim().toLowerCase();

        Integer numeroDoMes = meses.get(mes);

        if (numeroDoMes != null) {
            System.out.println("O número do mês " + mes + " é: " + numeroDoMes);
        } else {
            System.out.println("Mês inválido.");
        }

        sc.close();
    }
}
