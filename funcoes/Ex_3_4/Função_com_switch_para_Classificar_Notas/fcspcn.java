package funcoes.Ex_3_4.Função_com_switch_para_Classificar_Notas;

import java.util.Scanner;

public class fcspcn {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota de 0 a 10 para saber sua classificação: ");
        int nota = scanner.nextInt();

        System.out.println("Sua classificação para a Nota " + nota + " foi " + classificarNotas(nota));

        scanner.close();

    }

    public static char classificarNotas(int n) {
        switch (n) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            case 5:
                return 'E';
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                return 'F';
            default:
                return 'X';
        }
    }

}
