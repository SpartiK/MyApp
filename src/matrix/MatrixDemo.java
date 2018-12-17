package matrix;

import java.util.Arrays;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new int[][]{{2, 5, 5}, {2, 1, 6}});
        Matrix matrix2 = new Matrix(new int[][]{{2, 5, 5}, {2, 1, 6}, {2, 5, 4}});

        Matrix matrix3 = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}});
        Matrix matrix4 = new Matrix(new int[][]{{0, 0, 0}, {0, 0, 0}});
        Matrix matrix5 = new Matrix(new int[][]{{1, 3, 6}, {2, 2, 2}});

        matrix1.print();
        matrix2.print();
        matrix3.print();
        System.out.println(Arrays.deepToString(matrix1.sum(matrix2)));
        System.out.println(Arrays.deepToString(matrix1.sum(matrix3)));
        matrix4.sum(matrix5);
        matrix4.print();


        System.out.println(matrix1.getColumns());

        System.out.println(matrix1.getRows());

        matrix1.multiplicationOnNumber(10);
        matrix1.print();


    }
}




