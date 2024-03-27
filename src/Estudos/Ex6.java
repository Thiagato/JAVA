package Estudos;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a temperatura: ");
        int temp = scanner.nextInt();

        int fah = (9 * temp + 160) / 5;

        System.out.println(fah);
    }
}
