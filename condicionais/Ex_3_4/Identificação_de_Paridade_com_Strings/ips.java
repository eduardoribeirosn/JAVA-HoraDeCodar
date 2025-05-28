package condicionais.Ex_3_4.Identificação_de_Paridade_com_Strings;

import java.util.Scanner;

public class ips {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número.\n(Para descobrir se é Par ou Ímpar) ");
        int n = scanner.nextInt();

        String ip;

        if (n % 2 == 0) {
            ip = "Par!";
        } else {
            ip = "Ímpar!";
        }

        System.out.println(ip);

        scanner.close();

    }

}
