package conjunto_2_estruturas_condicionais;

import utils.Data;

import java.time.LocalDate;
import java.util.Scanner;

import static utils.Data.*;
import static utils.UtilsConjunto2.*;
import static java.time.LocalDate.now;

/**
 * @author Vinícius dos Santos Andrade
 */
public class Questao18 {

    /*
    18. Inclua no exercício anterior a solicitação do ano de nascimento e também da data de hoje.
    A partir destas informações, apresente a idade atual desta pessoa.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 18 - Idade Atual da pessoa");
        Scanner entrada = new Scanner(System.in);

        byte diaAtual, diaNascimento, mesNascimento, mesAtual;
        short anoNascimento, anoAtual;

        System.out.print("Dia nascimento: ");
        diaNascimento = getDia(entrada);

        System.out.print("Mês nascimento: ");
        mesNascimento = getMes(entrada);

        System.out.print("Ano nascimento: ");
        anoNascimento = getAno(entrada);

        if (isValidDate(diaNascimento, mesNascimento, anoNascimento)) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
            return; // Encerra o programa
        }

        // Para evitar que o usuário insira a data de hoje inválida
        // Vou pegar a data atual do Sistema Operacional
        LocalDate dataAtual = now();

        diaAtual = (byte) dataAtual.getDayOfMonth();
        mesAtual = (byte) dataAtual.getMonthValue();
        anoAtual = (short) dataAtual.getYear();

        Data dataNascimento = new Data(diaNascimento, mesNascimento, anoNascimento);
        Data hoje = new Data(diaAtual, mesAtual, anoAtual);

        System.out.println("Idade do usuário: ");
        System.out.println("Em dias:     " + getIdadeEmDias(dataNascimento, hoje));
        System.out.println("Em semanas:  " + getIdadeEmSemanas(dataNascimento, hoje));
        System.out.println("Em meses:    " + getIdadeEmMeses(dataNascimento, hoje));
        System.out.println("Em anos:     " + getIdadeEmAnos(dataNascimento, hoje));

        // Observação: Fiz a classe 'Data' na disciplina de Orientação a Objetos no Colégio Técnico de Campinas (COTUCA-UNICAMP)
        // Vou reaproveitar seus métodos estáticos para validar a data.
        entrada.close();
    }
}
