package Vetores;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int[] vetor2 = new int[5];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + 1 + "* Digite o numero: ");
            vetor[i] = scanner.nextInt();
        }


        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(i + 1 + "* Digite o numero: ");
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == vetor2[i]){
                System.out.println(vetor[i] + " São iguais");
            }
        }




    }
}