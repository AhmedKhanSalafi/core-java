package array;

import java.util.Scanner;

public class Code16 {
    public static void main(String[] args) {
        //specific element is duplicate or not in array

        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 9, 88, 66, 7};
        System.out.println("enter element");
        int el = sc.nextInt();
        int count = 0;

        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == el) {
                count++;
            }
            if (count == 0) {
                System.out.println("element not found");
            } else if (count == 1) {
                System.out.println("elmt not duplicate");
            } else {
                System.out.println("element duplicate");
            }

        }


    }}