package array;

public class Code15 {

    public static void main(String[] args) {
        //smallest element in array
        int arr[] = {55, 88, 44};
        int small = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
            System.out.println("smallest element in array" + small);

        }
    }
}