package Estudos;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o numero: ");
        int num = scanner.nextInt();

        if(num >= 100 && num <= 200){
            System.out.println("O numero está entre 100 e 200");
        } else
            System.out.println("ta não");




    }
}
