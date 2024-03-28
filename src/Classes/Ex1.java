package Classes;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex1classe aluno = new Ex1classe();

        System.out.println("Qual o nome do 🐵");
        aluno.nome = scanner.nextLine();

        System.out.println("Nota prova 1");
        aluno.prova1 = scanner.nextDouble();

        System.out.println("Nota prova 2");
        aluno.prova2 = scanner.nextDouble();

        System.out.println("Nota prova 3");
        aluno.prova3 = scanner.nextDouble();


        System.out.println(aluno.media());

    }
}
