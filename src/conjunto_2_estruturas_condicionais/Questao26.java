package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Questao26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois horarios diferentes para doscobrir a diferença em segundos:");
        System.out.println("Primeiro horarios no formato hh:mm:ss");
        String hora1 = sc.nextLine();
        System.out.println("Segundo horarios no formato hh:mm:ss");
        String hora2 = sc.nextLine();
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int aux = 0;
        for(int i =0; i<3;i++){
            String convert1 = "" + hora1.charAt(aux) + hora1.charAt(aux+1);
            String convert2 = "" + hora2.charAt(aux) + hora2.charAt(aux+1);
            aux = aux+3;
            array1[i] = Integer.parseInt(convert1);
            array2[i] = Integer.parseInt(convert2);
        }
        int segundos1= ((array1[0]*60)*60) + (array1[1]*60) + array1[2];
        int segundos2= ((array2[0]*60)*60) + (array2[1]*60) + array2[2];

        int resultado = segundos1 - segundos2;
        if(resultado<0){
            resultado = resultado*-1;
        }

        System.out.println("A diferença em segundos é: "+resultado+"s");


        sc.close();
    }
}
