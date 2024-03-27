package Estudos;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Numero 2: ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("numero 1 é maior");
        } else if (num2 > num1){
            System.out.println("numero 2 é maior");
        } else
            System.out.println("mesma porra");

    }



}
