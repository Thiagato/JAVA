package Classes;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex4classe funcionario = new Ex4classe();

        double porcentagem;

        System.out.println("qual o nome: ");
        funcionario.nome = scanner.nextLine();

        System.out.println("Slario brutoi: ");
        funcionario.salarioBruto = scanner.nextDouble();

        System.out.println("taxa: ");
        funcionario.imposto = scanner.nextDouble();


        System.out.println(funcionario.nome+ "vai receber: " + funcionario.salarioLiquido());

        System.out.println("Qual a porcentagem a amis: ");
        porcentagem = scanner.nextDouble();

        funcionario.incrementoSalario(porcentagem);

        System.out.println(funcionario.nome + ", " + funcionario.salarioBruto);
    }
}
