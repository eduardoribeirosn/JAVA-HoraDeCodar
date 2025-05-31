package variaveis.Projeto_Construcao_do_Produto;

import java.util.Scanner;

public class construcao_do_produto {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String produto1 = "Mouse", produto2 = "Teclado", produto3 = "Headset";

        System.out.println("Digite um nome de produto: ");
        String produto = scanner.nextLine();

        if (produto.equalsIgnoreCase(produto1)  || produto.equalsIgnoreCase(produto2) || produto.equalsIgnoreCase(produto3)) {
            System.out.println("Deseja alterar o preço? (S/N)");
            char sn = scanner.nextLine().toLowerCase().trim().charAt(0);
            if (sn == 's') {
                System.out.println("Qual o novo preço? ");
                float preco = scanner.nextFloat();
                if (preco <= 50) {
                    System.out.println("Barato!");
                } else if (preco <= 100) {
                    System.out.println("Moderado!");
                } else {
                    System.out.println("Caro!");
                }
            } else {
                
            }
        } else {
            System.out.println("Me informe o preço do novo produto: ");
            float preco = scanner.nextFloat();
            if (preco <= 50) {
                    System.out.println("Barato!");
                } else if (preco <= 100) {
                    System.out.println("Moderado!");
                } else {
                    System.out.println("Caro!");
                }
            System.out.println("Nome do Produto: " + produto + "\nPreço do Produto: R$" + preco);
        }

        scanner.close();

    }

}
