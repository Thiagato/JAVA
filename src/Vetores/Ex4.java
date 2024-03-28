package Vetores;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Qual o numero que se repete");
        int num = scanner.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + 1 + "* Digite o numero: ");
            vetor[i] = scanner.nextInt();
        }
        int contas = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num){
                contas++;
            }
        }

        System.out.println("O numero: " + num +" se repetiu: " + contas);
        
        
        
        
        
        
    }

  


}
