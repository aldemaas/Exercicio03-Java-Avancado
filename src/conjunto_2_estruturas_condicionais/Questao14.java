package conjunto_2_estruturas_condicionais;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Aldemir Carlos Alves de Lima
 */
public class Questao14 {

    /*
    14. Receba do usuário o nome de um mês. Exiba o número equivalente.
    Obs.: para comparar Strings em Java deve-se usar o metodo equals ou equalsIgnoreCase,
    mas nunca o operador “==”. Por exemplo, para comparar a variável nome com “Maria”
    deve-se usar: if(nome.equals(“Maria”) ...
     */

    public static void main(String[] args) {
        System.out.println("Exercício 14 - Mês do ano");
        Scanner sc = new Scanner(System.in);

        String mes;
        Integer numeroDoMes;

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

        System.out.print("Digite o nome de um mês específico: ");
        mes = sc.nextLine().trim().toLowerCase();

        numeroDoMes = meses.get(mes);

        if (numeroDoMes != null) {
            System.out.println("O número do mês " + mes + " é: " + numeroDoMes);
        } else {
            System.out.println("Mês inválido.");
        }

        sc.close();
    }
}
