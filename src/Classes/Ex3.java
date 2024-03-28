package Classes;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex3classe produto = new Ex3classe();

        System.out.println("Qual o valor do produto: ");
        produto.compra = scanner.nextDouble();

        System.out.println(produto.prestacao()+ " cada parcela vai ser");
    }

}
