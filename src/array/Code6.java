package array;

import java.util.Scanner;
import java.util.stream.Stream;

public class Code6 {

    public static void main(String[] args) {

        //swap array elements of specific location

        Scanner sc= new Scanner(System.in);
        int [] arr= {6,2,8,9,1,6,7,5};
        int n= arr.length;
        System.out.println("enter two location from o to "+(n-1));

        int a = sc.nextInt();
        int b= sc.nextInt();

        System.out.println("before swapping");
        for (int bs: arr) {
            System.out.println(bs);
        }

        int temp = arr[a];
       arr[a]=arr[b];
       arr[b] =temp;

        for (int as: arr){
            System.out.println("after swapping"+as);
        }
    }
}
