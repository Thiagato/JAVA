package Estudos;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int aux = 0;

        System.out.println("numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("numero 2: ");
        int num2 = scanner.nextInt();

        System.out.println("numero 1: " + num1 + " numero 2: " + num2);

        aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.println("numero 1: " + num1 + " numero 2: " + num2);

        scanner.close();
    }
}
