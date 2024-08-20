package conjunto_4_estruturas_de_repeticao_aninhadas;

import java.util.Arrays;
import java.util.Scanner;

public class Questao65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidades de linha que vc quer sua piramide");
        int linhas = sc.nextInt();
        int as = 1;
        int tex = 1;
        for (int i = 1; i <linhas; i++) {
            as = as+2;
        }
        String[][] asString = new String[linhas][as];
        for(int i = 0; i<linhas; i++){
           int aux = (as-1)/2;
           for(int j = 0;j<tex;j++){
               asString[i][aux] = "*";
               aux++;
           }
           tex = tex+2;
           as = as -2;
        }
        for(int i = 0; i<asString.length;i++){
            for(int j = 0; j<asString[i].length;j++){
                if(asString[i][j] == null){
                    asString[i][j] = " ";
                }
            }
        }
        for(String[] a : asString) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < a.length; i++) {
                sb.append(a[i]);
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
