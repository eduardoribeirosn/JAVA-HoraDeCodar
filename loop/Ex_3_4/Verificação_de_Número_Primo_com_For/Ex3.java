package loop.Ex_3_4.Verificação_de_Número_Primo_com_For;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número para saber se ele é primo: ");
        int n = scanner.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("O Número " + n + " não é um Número primo!");
                System.exit(0);
            }
        }

        System.out.println("O Número " + n + " é um Número primo!");

        scanner.close();
    }

}
