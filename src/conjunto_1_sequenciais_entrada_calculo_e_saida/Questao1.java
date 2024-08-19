package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano do seu nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        if (anoNascimento < anoAtual) {
            int idadeUsuario = anoAtual - anoNascimento;
            System.out.println("Sua idade é " + idadeUsuario + " anos.");
        } else if (anoNascimento == anoAtual) {
            System.out.println("Você nasceu no ano atual.");
        } else {
            System.out.println("O ano de nascimento não pode ser maior que o ano atual.");
        }
        sc.close();
    }
}

