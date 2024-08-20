package conjunto_2_estruturas_condicionais;
import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println("Ordem crescente: " + num1 + ", " + num2);
        } else {
            System.out.println("Ordem crescente: " + num2 + ", " + num1);
        }

        sc.close();
    }
}
