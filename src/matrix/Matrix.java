package matrix;

import java.util.Arrays;

public class Matrix {
    private int[][] array;


    public Matrix() {
    }

    Matrix(int[][] array) {
        this.array = array;

    }

    public void sum(Matrix m1, Matrix m2) {
        int[][] sum = new int[m1.array.length][m1.array[0].length];

        if (m1.array.length == m2.array.length && m1.array[0].length == m2.array[0].length) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    sum[i][j] = m1.array[i][j] + m2.array[i][j];

//                    System.out.println(m1.array[i][j] + m2.array[i][j]);
                }
            }
            System.out.println(Arrays.deepToString(sum));
        } else System.out.println("Матрицы не равны");
    }

    public void multiplicationOnNumber() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] *= 5;

//                    System.out.println(m1.array[i][j] + m2.array[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(array));

    }

    public void multiplication(Matrix m1, Matrix m2) {
        int[][] sum = new int[m1.array.length][m1.array[0].length];

        if (m1.array.length == m2.array.length && m1.array[0].length == m2.array[0].length) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    sum[i][j] = m1.array[i][j] * m2.array[i][j];

//                    System.out.println(m1.array[i][j] + m2.array[i][j]);
                }
            }
            System.out.println(Arrays.deepToString(sum));
        } else System.out.println("Матрицы не равны");
    }

    public int getRows() {
        return array.length;
    }

    public int getColumns() {
        return array[0].length;
    }

    public void print() {

        System.out.println(Arrays.deepToString(array));
    }

}



