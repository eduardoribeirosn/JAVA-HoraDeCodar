package funcoes.Ex_3_4.Função_com_if_else_para_Verificar_Paridade;

import java.util.Scanner;

public class fciepvp {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para saber se ele é Ímpar ou Par: ");
        int n = scanner.nextInt();

        System.out.println("O número " + n + " é " + ip(n));

        scanner.close();

    }

    public static String ip(int n) {
        if (n % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }

}
