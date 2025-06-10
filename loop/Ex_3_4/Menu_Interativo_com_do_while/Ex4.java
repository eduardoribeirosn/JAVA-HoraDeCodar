package loop.Ex_3_4.Menu_Interativo_com_do_while;

import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("Escolha uma opção abaixo: ");
            System.out.println("1 - Gere Um número aleatório!");
            System.out.println("2 - Gere Dois números aleatórios!");
            System.out.println("3 - Gere Três números aleatórios!");
            System.out.println("4 - Encerre o Programa!");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println((int) (Math.random() * 101));
                    break;
                case 2:
                    System.out.println(((int) (Math.random() * 101)) + " " + ((int) (Math.random() * 101)));
                    break;
                case 3:
                    System.out.println(((int) (Math.random() * 101)) + " " + ((int) (Math.random() * 101)) + " " + ((int) (Math.random() * 101)));
                    break;
                case 4:
                    System.out.println("Programa encerrando...");
                    break;    
                default:
                    System.out.println("Valor incorreto, por favor digite entre 1 a 4.\n");
                    break;
            }
        } while (option != 4);

        scanner.close();

    }

}
