package funcoes.Ex_5_6.Função_que_Recebe_um_Array_e_Retorna_o_Maior_Número;

import java.util.Scanner;

public class fqruaeromn {
    
    public static void main(String[] args) {

        int[] numbers = {55, 5, 7, 12, 34, 25};
        
        System.out.println("O maior número é " + maior(numbers));

    }

    public static int maior(int[] numbers) {
        int m = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > m) {
                m = numbers[i];
            }
        }
        return m;
    }

}
