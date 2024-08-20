package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Questao23 {
    public static class Pessoa{
        String name;
        int diaDeNasc;
        int mesDeNasc;

        public Pessoa(String name, int diaDeNasc, int mesDeNasc) {
            this.name = name;
            this.diaDeNasc = diaDeNasc;
            this.mesDeNasc = mesDeNasc;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe nome:");
        String nome = sc.nextLine();
        System.out.println("Me informe dia de nascimento:");
        int dia = sc.nextInt();
        System.out.println("Me informe mês de nascimento:");
        int mes = sc.nextInt();
        sc.nextLine();
        Pessoa p1 = new Pessoa(nome,dia,mes);
        System.out.println("---- Agora as pessoas de comparação ----");
        System.out.println("Me informe nome:");
        nome = sc.nextLine();
        System.out.println("Me informe dia de nascimento:");
        dia = sc.nextInt();
        System.out.println("Me informe mês de nascimento:");
        mes = sc.nextInt();

        Pessoa p2 = new Pessoa(nome,dia,mes);

        if(p1.mesDeNasc < p2.mesDeNasc){
            System.out.println(p1.name + " Faz aniversário primeiro");
        } else if (p1.mesDeNasc > p2.mesDeNasc){
            System.out.println(p2.name + " Faz aniversário primeiro");
        } else{
            if (p1.diaDeNasc < p2.diaDeNasc){
                    System.out.println(p1.name + " Faz aniversário primeiro");
            } else if (p1.diaDeNasc > p2.diaDeNasc){
                System.out.println(p2.name + " Faz aniversário primeiro");
            } else{
                System.out.println(p1.name + " e " + p2.name + " faz aniversario no mesmo dia.");
            }
        }


        sc.close();
    }
}
