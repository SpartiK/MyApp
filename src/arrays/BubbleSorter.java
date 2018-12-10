package arrays;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class BubbleSorter {


    public static void main(String[] args) {
    int [] array = new int[] {1,2,4,5,3,6};
    sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array){
       step:


        for (int i = 0; i<array.length;i++){
            int r = 0;
        for (int j = array.length-1;j>i;j--){
            if (array[j-1]>array[j]) {
                int tmp = array[j-1];
                array[j-1]=array[j];
                array[j] = tmp;
                 r = 1;


            }
            if (r==0&&j==i+1) break step;


        }

        }




    }


}
