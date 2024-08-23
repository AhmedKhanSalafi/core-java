package array;

public class Code19 {
    public static void main(String[] args) {

        int[] arr = {55, 33, 22, 44, 88};
        System.out.println("Odd Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);

            }
        }
    }}
