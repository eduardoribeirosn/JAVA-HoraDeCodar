package arrays.Ex_3_4.Transpor_uma_Matriz_2D;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {
        
        int[][] matrix2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2dT = new int[matrix2d.length][matrix2d[0].length];
        
        for (int[] i : matrix2d) {
            System.out.println(Arrays.toString(i));
        }

        System.out.println();

        for (int i = 0; i < matrix2d.length; i++) {
            for (int j = 0; j < matrix2d[i].length; j++) {
                matrix2dT[i][j] = matrix2d[j][i];
            }
        }

        System.out.println();

        for (int[] j : matrix2dT) {
            System.out.println(Arrays.toString(j));
        }
    }
    
}
