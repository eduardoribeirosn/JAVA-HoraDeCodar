package condicionais.Ex_5_6.Verificação_de_Intervalo_com_AND;

import java.util.Scanner;

public class viand {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:\n(Entre 10 a 20)");
        float n = scanner.nextFloat();

        if (10 <= n  && n <= 20) {
            System.out.println("Dentro do Intervalo!");
        } else {
            System.out.println("Fora do Intervalo!");
        }

        scanner.close();

    }

}
