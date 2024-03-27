package Vetores;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a quantidade de numero 🐵");
        int[] num = new int[scanner.nextInt()];

        for (int i = 0; i < num.length; i++) {
            System.out.println(i + 1 + "* numero: ");
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 0){
                System.out.println("positivo: " + num[i]);
            } else if (num[i] <= 0){
                System.out.println("negativo: " + num[i]);
            } else {
                System.out.println("zero: " + num[i]);
            }
        }


        scanner.close();











    }



}
