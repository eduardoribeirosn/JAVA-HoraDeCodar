package arrays.Ex_5.Remover_Elementos_Duplicados_de_um_Array;

import java.util.Arrays;
import java.util.ArrayList;

public class Ex5ComArrayList {
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 0, 0};
        ArrayList<Integer> numbersU = new ArrayList<>();

        boolean has = false;

        for (int i = 0; i < numbers.length; i++) {
            has = false;
            for (int j = 0; j < numbersU.size(); j++) {
                if (numbers[i] == numbersU.get(j)) {
                    has = true;
                }
            }
            if (has == false) {
                numbersU.add(numbers[i]);
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbersU);

    }
    
}
