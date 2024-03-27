package Estudos;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("numero 2: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println("A soma fica: " + soma + "\na subtração fica: " + sub + "\na multiplicação fica: " + mult + "\na divisão fica: " + div);



    }
}
