package Vetores;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] num = new int[10];
        int[] menor = new int[num.length];
        int[] maior = new int[num.length];
        int[] igual = new int[num.length];

        System.out.println("Fala ai 10 numeros parcero: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(i+1 + "* numero: ");
            num[i] = scanner.nextInt();
        }

        float media = 0;

        for (int i = 0; i < num.length; i++) {
            media += num[i];

        }
        media = media / num.length;

        for (int i = 0; i < num.length; i++) {
            if(num[i] < media){
                menor[i] = num[i];
            } else if (num[i] > media) {
                maior[i] = num[i];
            } else {
                igual[i] = num[i];
            }

        }
        for (int i = 0; i < menor.length; i++) {
            if (menor[i] != 0){
                System.out.println("OS MENORES NUMEROS SÃO: " + menor[i]);
            }
            }
        for (int i = 0; i < maior.length; i++) {
            if (maior[i] != 0){
                System.out.println("OS maiores SÃO: " + maior[i]);
            }
        }

        for (int i = 0; i < igual.length; i++) {
            if (igual[i] != 0){
                System.out.println("OS iguais SÃO: " + igual[i]);
            }
        }

        System.out.println("a media é: " + media);
    }

}

