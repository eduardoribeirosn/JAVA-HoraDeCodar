package funcoes.Ex_1_2.Função_para_Calcular_o_Fatorial_de_um_Número;

import java.util.Scanner;

public class fpcofdun {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um Número inteiro para saber o fatorial: ");
        int n = scanner.nextInt();

        System.out.println("O fatorial de " + n + " é " + converterFatorial(n));

        scanner.close();
    }

    public static int converterFatorial(int n) {
        int t = n;
        if (t == 0) {
            return 1;
        }
        while(n != 1) {
            t *= n - 1;
            n--;
        }
        return t;
    }

}
