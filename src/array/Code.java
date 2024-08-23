package array;

import java.util.Scanner;

public class Code {

    public static void main(String[] args) {

        //read array value from user

        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        int arr []= new int [n];

        for (int i = 0;i<=n;i++){

            arr[i]=sc.nextInt();
            System.out.println("array element are");
        }
        for (int e : arr){

            System.out.println(e);
        }
    }
}
