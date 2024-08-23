package array;

public class Code20 {

    public static void main(String[] args) {

        //swap the first even number and last odd number

        int[] arr = {55, 33, 22, 44, 88,77};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                System.out.println("display even number in the array :" + arr[i]);


            }
            for (int j = arr.length-1; j >= 0; j--) {
                if (arr[j] % 2 != 0) {

                    System.out.println("display odd number in the array :" + arr[j]);

                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;

                System.out.println("after swapping");
                for (int k = 0; k <= arr.length; k++) {
                    System.out.println(arr[k]);

                }


            }
        }
    }}