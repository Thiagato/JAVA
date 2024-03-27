package Estudos;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("bote seu numero 😀");

        int numero = scanner.nextInt();

        if(numero > 10){
            System.out.println("numero maior q 10");
        } else {
            System.out.println("numero menor ou igual a 10");
        }


    }




}
