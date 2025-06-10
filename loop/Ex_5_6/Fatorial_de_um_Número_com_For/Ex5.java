package loop.Ex_5_6.Fatorial_de_um_Número_com_For;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para saber o fatorial dele: ");
        int n = scanner.nextInt();

        int fat = n;

        for (int i = n - 1; i != 1; i--) {
            fat *= i;
        }

        System.out.println("O fatorial de " + n + " é " + fat);

        scanner.close();

    }
    
}
