package array;

import java.util.Arrays;

public class Code24 {

    public static void main(String[] args) {
       //copy element of one array to another array

       int ar1 []={88,99,66,55};
       int ar2[]=new int[ar1.length];
       int i=0;
       for (int el :ar1){

           ar2[i]=el;
           i++;
       }
        System.out.println("ar2 element :"+ Arrays.toString(ar2));

    }
}
