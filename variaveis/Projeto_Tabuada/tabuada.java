package variaveis.Projeto_Tabuada;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para receber sua tabuada: ");
        int number = scanner.nextInt();

        System.out.println("1 x " + number + " = " + (1 * number));
        System.out.println("2 x " + number + " = " + (2 * number));
        System.out.println("3 x " + number + " = " + (3 * number));
        System.out.println("4 x " + number + " = " + (4 * number));
        System.out.println("5 x " + number + " = " + (5 * number));
        System.out.println("6 x " + number + " = " + (6 * number));
        System.out.println("7 x " + number + " = " + (7 * number));
        System.out.println("8 x " + number + " = " + (8 * number));
        System.out.println("9 x " + number + " = " + (9 * number));
        System.out.println("10 x " + number + " = " + (10 * number));

        scanner.close();

    }
    
}
