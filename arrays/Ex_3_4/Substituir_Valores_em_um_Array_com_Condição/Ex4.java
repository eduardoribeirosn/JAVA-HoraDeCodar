package arrays.Ex_3_4.Substituir_Valores_em_um_Array_com_Condição;

import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, -3, -4, 5, -6, -7, -8, 9, 0};

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] *= 0;
            }
        }

        System.out.println(Arrays.toString(numbers));

    }
    
}
