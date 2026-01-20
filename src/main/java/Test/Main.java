package Test;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [][] matrix = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j != i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
