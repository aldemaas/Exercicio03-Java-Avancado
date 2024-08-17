package conjunto_2_estruturas_condicionais;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {

        Map<String, Integer> meses = new HashMap<>();
        meses.put("Janeiro", 1);
        meses.put("Fevereiro", 2);
        meses.put("Março", 3);
        meses.put("Abril", 4);
        meses.put("Maio", 5);
        meses.put("Junho", 6);
        meses.put("Julho", 7);
        meses.put("Agosto", 8);
        meses.put("Setembro", 9);
        meses.put("Outubro", 10);
        meses.put("Novembro", 11);
        meses.put("Dezembro", 12);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome de um mês específico: ");
        String mes = sc.nextLine().trim();

        Integer numeroDoMes = meses.get(mes);

        if (numeroDoMes != null) {
            System.out.println("O número do mês " + mes + " é: " + numeroDoMes);
        } else {
            System.out.println("Mês inválido.");
        }

        sc.close();
    }
}
