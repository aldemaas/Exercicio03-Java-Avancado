package conjunto_4_estruturas_de_repeticao_aninhadas;

import java.util.Scanner;

/**
 * @author Pedro Emanoel Souza Rocha
 */
public class Questao65 {

    /*
    65. Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.
    *
    ***
    *****
    *******
    *********
    ***********
    *************
    ***************
    ...
     */

    public static void main(String[] args) {
        System.out.println("Exercício 65 - desenha uma pirâmide de asteriscos com o número de linhas determinado pelo usuário.");
        Scanner sc = new Scanner(System.in);

        String[][] asString;
        int linhas, as, tex;

        System.out.println("Informe a quantidades de linha que vc quer sua piramide");
        linhas = sc.nextInt();
        as = 1;
        tex = 1;

        for (int i = 1; i < linhas; i++) {
            as = as + 2;
        }

        asString = new String[linhas][as];

        for (int i = 0; i < linhas; i++) {
            int aux = (as - 1) / 2;
            for (int j = 0; j < tex; j++) {
                asString[i][aux] = "*";
                aux++;
            }
            tex = tex + 2;
            as = as - 2;
        }

        for (int i = 0; i < asString.length; i++) {
            for (int j = 0; j < asString[i].length; j++) {
                if (asString[i][j] == null) {
                    asString[i][j] = " ";
                }
            }
        }

        for (String[] a : asString) {
            StringBuilder sb = new StringBuilder();
            for (String s : a) {
                sb.append(s);
            }
            System.out.println(sb);
        }

        sc.close();
    }
}
