package loop.Ex_5_6.Contagem_de_Dígitos_de_um_Número_com_While;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int cont = 0;

        while (n != 0) {

            n /= 10;

            cont++;

        }

        System.out.println("A quantidade de números é " + cont);
        
        scanner.close();

    }
    
}
