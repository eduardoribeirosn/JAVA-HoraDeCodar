package arrays.Ex_1_2.Inventer_Elementos_de_um_Array;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 11, 13, 17};
        int[] numbersI = new int[numbers.length];

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(inventer(numbers, numbersI)));

    }
    
    public static int[] inventer(int[] numbers, int[] numbersI) {
        int i = 0, j = numbers.length - 1;
        while(j >= 0) {
            numbersI[i] = numbers[j];

            j--;
            i++;
        }

        return numbersI;

    }

}
