package array;

import java.util.Arrays;
import java.util.Random;

public class Code28 {

    //sort array element and display as string

    public static void main(String[] args) {

        Random rn = new Random();
        int ar []= new int [5];

        for (int i=0;i<5;i++){

            ar[i]=rn.nextInt(100);
        }
        System.out.println("array before sorting :"+ Arrays.toString(ar));
Arrays.sort(ar);
        System.out.println("array after sorting :"+ Arrays.toString(ar));


    }
}
