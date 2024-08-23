package array;

import java.util.Arrays;

public class Code22 {

    //reverse all element in given array without second array

    public static void main(String[] args) {
        int[] array = {4, 2, 9, 6, 23, 90};
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;

        }
        System.out.println(Arrays.toString(array));

    }



    }

