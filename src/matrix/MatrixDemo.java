package matrix;

import java.util.Arrays;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new int[][]{{2, 5, 5}, {2, 1, 6}});
        Matrix matrix2 = new Matrix(new int[][]{{2, 5, 5}, {2, 1, 6}, {2, 5, 4}});

        Matrix matrix3 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6,3}});

        matrix1.print();
        matrix2.print();
        matrix3.print();
        matrix1.sum(matrix1, matrix2);
        matrix1.sum(matrix1, matrix3);
        System.out.println(matrix1.getColumns());
        System.out.println(matrix1.getRows());
        matrix1.multiplicationOnNumber();


    }
}




