package conjunto_3_estruturas_de_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Questao53 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Forneça um número.");
        int x = sc.nextInt();

        int tabuada = 10;

        for ( int i = 1; i <= tabuada;  i++ ){
            System.out.println(x + " x " + i + " = " + (x * i));
        }

        sc.close();
    }
}
