package conjunto_1_sequenciais_entrada_calculo_e_saida;

import java.util.Scanner;

/**
 * @author Suerdo Flaubert Campos de Lucena Júnior
 */
public class Questao1 {

    /*
    1. Determine qual é a idade que o usuário faz no ano atual.
    Para isso solicite o seu ano de nascimento e o ano atual.
     */

    public static void main(String[] args) {
        System.out.println("1 - Idade do usuário");
        Scanner sc = new Scanner(System.in);

        int anoNascimento, anoAtual, idadeUsuario;

        System.out.println("Digite o ano do seu nascimento: ");
        anoNascimento = sc.nextInt();

        System.out.println("Digite o ano atual: ");
        anoAtual = sc.nextInt();

        if (anoNascimento < anoAtual) {
            idadeUsuario = anoAtual - anoNascimento;
            System.out.println("Sua idade é " + idadeUsuario + " anos.");
        } else if (anoNascimento == anoAtual) {
            System.out.println("Você nasceu no ano atual.");
        } else {
            System.out.println("O ano de nascimento não pode ser maior que o ano atual.");
        }
        sc.close();
    }
}

