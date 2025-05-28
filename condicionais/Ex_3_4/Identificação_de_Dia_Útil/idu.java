package condicionais.Ex_3_4.Identificação_de_Dia_Útil;

import java.util.Scanner;

public class idu {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número de 1 a 7.\n(1 = Domingo 2 = Segunda...)");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Final de Semana!");
                break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Dia Útil!");
                    break;
                case 7:
                    System.out.println("Final de Semana!");
                    break;
                default:
                    System.out.println("O número é inválido, escolha de 1 a 7 dias.");
        }

        scanner.close();

    }

}
