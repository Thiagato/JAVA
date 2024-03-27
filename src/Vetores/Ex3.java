package Vetores;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

       int[] vetorOriginal = vetor();

       int[] vetorDobro = dobro(vetorOriginal);

        System.out.println("o dobro");
        for (int i = 0; i < vetorDobro.length; i++) {
            System.out.println(vetorDobro[i]);
        }
    }


    public static int[] vetor(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a quantidade de numeros 🐵");
        int tamanho = scanner.nextInt();
        int[] num = new int[tamanho];

        for (int i = 0; i < num.length; i++) {
            System.out.println(i + 1 + "* numero: ");
            num[i] = scanner.nextInt();
        }
        return num;
    }
    public static int[] dobro(int[] num){
        int[] dobro = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            dobro[i] = num[i] * 2;
        }

        return dobro;
    }


}
