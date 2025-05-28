package condicionais.Ex_5_6.Classificação_de_Letra;

import java.util.Scanner;

public class cl {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma letra: ");
        char l = scanner.next().toLowerCase().trim().charAt(0);

        if (Character.isLetter(l)) {
            switch (l) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vogal!");
                    break;
                default:
                    System.out.println("Consoante!");
            } 

        } else {
            System.out.println("Favor inserir uma letra");
        }
        
        scanner.close();
    }
    
}
