package matrix;

import java.util.Arrays;

public class Matrix {
    private int[][] array;
    private int rows, colums;

    public Matrix() {
    }
    Matrix(int[][] array) {
        this.array = array;
        this.rows = array.length;
        this.colums = array[0].length;
    }
    public int[][] sum(Matrix m1) {
        if (rows == m1.rows&&colums==m1.colums) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] += m1.array[i][j];
//                    System.out.println(m1.array[i][j] + m2.array[i][j]);
                }
            }
            return array;
        } else {
            System.out.println("Матрицы не равны");
            return array;
        }
    }
    public int[][] multiplication(Matrix m1) {
        if (rows == m1.rows&&colums==m1.colums) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] *= m1.array[i][j];
//                    System.out.println(m1.array[i][j] + m2.array[i][j]);
                }
            }
            return array;
        } else {
            System.out.println("Матрицы не равны");
            return array;
        }
    }
    public int[][] multiplicationOnNumber(int n) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] *= n;
//                    System.out.println(m1.array[i][j] + m2.array[i][j]);
            }
        }
        return array;
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



