package Estudos;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o numero senhor-sama");
        int num = scanner.nextInt();

        System.out.println("Qual o outro numero caralho");
        int num2 = scanner.nextInt();

        if(num > num2){
            System.out.println("O primeiro numero é o maior");
        } else if (num2 > num){
            System.out.println("o Segundo numero é o maior");
        } else {
            System.out.println("os numeros são iguais cacete");
        }



    }

}
