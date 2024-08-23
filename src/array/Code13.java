package array;

public class Code13 {

    public static void main(String[] args) {

        //print odd number of array using loop

        int arr[] = {55, 88, 44};

        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.println("print odd number of array" + i);
            }
        }
    }}