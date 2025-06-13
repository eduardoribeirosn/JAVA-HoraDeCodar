package arrays.Ex_5.Remover_Elementos_Duplicados_de_um_Array;

import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 10, 10};
        int[] numbersS =  new int[numbers.length];
        boolean has = false;
        int cont = 1;

        numbersS[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            has = false;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbersS[j]) {
                    has = true;
                }
            }
            if (has == false) {
                cont++;
                numbersS[cont - 1] = numbers[i];
            }
        }

        int[] numbersF = new int[cont];

        for (int i = 0; i < cont; i++) {
            numbersF[i] = numbersS[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbersS));
        System.out.println(Arrays.toString(numbersF));

    }
    
}
