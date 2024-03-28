package Classes;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex2classe vendedor = new Ex2classe();

        System.out.println("Qual o nome do parserio: ");
        vendedor.nome = scanner.nextLine();

        System.out.println("Qual o salario: ");
        vendedor.salario = scanner.nextDouble();

        System.out.println("vendeu quantas: ");
        vendedor.vendas = scanner.nextDouble();

        System.out.println("quanto custa : ");
        vendedor.celular = scanner.nextDouble();

        System.out.println(vendedor.salariofinal());
    }



}
