package arrays;

import java.util.Arrays;

public class InvertSort {

    public static void main(String[] args) {
        int [] array = new int[] {2,7,8,1,6,9};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = arr00000 ay[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

}
