package Vetores;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];
        int[] vetorB = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite os numeros: ");
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            vetorB[i] = vetor[vetor.length - 1 - i];
        }
        System.out.println("vetor b ao contrario");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }
    }

}
