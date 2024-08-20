package conjunto_2_estruturas_condicionais;

public class Questao28 {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int c = 5;

        if (a > b) {
            int temp1 = a;
            a = b;
            b = temp1;
        }
        if (b > c) {
            int temp2 = b;
            b = c;
            c = temp2;
            if (a > b) {
                int temp3 = a;
                a = b;
                b = temp3;
            }
        }

        System.out.println("Números em ordem crescente: "
                + a + ", " + b + ", " + c);

    }
}
