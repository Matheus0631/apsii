package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro = new Livro();
        CD cd = new CD();

        System.out.println("=== Cadastro do Livro ===");
        System.out.print("Digite o nome do livro: ");
        livro.setNome(scanner.nextLine());

        System.out.print("Digite o autor do livro: ");
        livro.setAutor(scanner.nextLine());

        System.out.print("Digite o preço do livro: ");
        livro.setPreco(Double.parseDouble(scanner.nextLine()));

        System.out.println("\n=== Cadastro do CD ===");
        System.out.print("Digite o nome do CD: ");
        cd.setNome(scanner.nextLine());

        System.out.print("Digite o preço do CD: ");
        cd.setPreco(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite a quantidade de faixas: ");
        cd.setNumFaixas(Integer.parseInt(scanner.nextLine()));

        cd.exibeInformacoes();

        scanner.close();
    }
}
