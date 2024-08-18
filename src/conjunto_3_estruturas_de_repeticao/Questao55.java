package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao55 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorMensal = 50.00;
        double minMensal = 100;
        double minBonus = 50;
        System.out.println("tipo de ligação (‘o’ = outras\n" +
                "operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo) e depois a quantidade de " +
                "minutos");
        String s_n = "";
        do{
            String ligacao = sc.nextLine();
            double min = sc.nextDouble();
            if(ligacao.equals("v")){
                if(min > minBonus && minBonus>0){
                    min = min - minBonus;
                    minBonus=0;
                    if(min > minMensal){
                        double aux = min - minMensal;
                        minMensal = 0;
                        valorMensal = valorMensal+(aux*0.20);
                        System.out.printf("Disponivel ainda %.2f minutos e %.2f minutos bonus,\nvalor a pagar %.2f\n",
                                minMensal,minBonus,valorMensal);
                        System.out.println("Gostaria de outra ligação s - sim e n - não");
                        sc.nextLine();
                        s_n = sc.nextLine();
                        continue;
                    }
                    minMensal = minMensal - min;
                    System.out.printf("Disponivel ainda %.2f minutos e %.2f minutos bonus,\nvalor a pagar %.2f\n",
                            minMensal,minBonus,valorMensal);
                    System.out.println("Gostaria de outra ligação s - sim e n - não");
                    sc.nextLine();
                    s_n = sc.nextLine();
                    continue;
                }
                if(minBonus>0){
                    minBonus = minBonus - min;
                    System.out.printf("Disponivel ainda %.2f minutos e %.2f minutos bonus,\nvalor a pagar %.2f\n",
                            minMensal,minBonus,valorMensal);
                    System.out.println("Gostaria de outra ligação s - sim e n - não");
                    sc.nextLine();
                    s_n = sc.nextLine();
                    continue;
                }
                if(minMensal > 0){
                    if(min > minMensal){
                        double aux = min - minMensal;
                        minMensal=0;
                        valorMensal = valorMensal + (aux*0.20);
                    }
                }else{
                    valorMensal = valorMensal + (min*0.20);
                }
            }
            if(ligacao.equals("o")){
                if(minMensal > 0){
                    if(min >= minMensal){
                        double aux = min - minMensal;
                        minMensal=0;
                        valorMensal = valorMensal + (aux*0.65);
                    }else{
                        minMensal = minMensal - min;
                    }
                }else{
                    valorMensal = valorMensal + (min*0.65);
                }
            }
            if(ligacao.equals("f")){
                double minTele = min/2;
                if(minMensal > 0){
                    if(minTele >= minMensal){
                        double aux = minTele - minMensal;
                        minMensal=0;
                        valorMensal = valorMensal + (aux*0.65);
                    }
                    else{
                        minMensal = minMensal - minTele;
                    }
                }else{
                    valorMensal = valorMensal + (minTele*0.65);
                }
            }
            System.out.printf("Disponivel ainda %.2f minutos e %.2f minutos bonus,\nvalor a pagar %.2f",
                    minMensal,minBonus,valorMensal);
            System.out.println();
            System.out.println("Gostaria de outra ligação s - sim e n - não");
            sc.nextLine();
            s_n = sc.nextLine();

        }while(s_n.equals("s"));
        sc.close();
    }
}
