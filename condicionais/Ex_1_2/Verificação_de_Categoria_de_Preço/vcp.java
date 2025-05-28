package condicionais.Ex_1_2.Verificação_de_Categoria_de_Preço;

import java.util.Scanner;

public class vcp {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o Preço do Produto: ");
        float preco = scanner.nextFloat();

        if (preco < 50.0) {
            System.out.println("O Produto é BARATO!");
        } else if (preco <= 100.0) {
            System.out.println("O Produto é MÉDIO");
        } else {
            System.out.println("O Produto é CARO");
        }

        scanner.close();

    }

}
