package array;

public class Code7 {
    public static void main(String[] args) {

//sum of array element
        //Initialize array
       // int [] arr = new int [] {1, 2, 3, 4, 5};
        int [] arr =  {1, 2, 3, 4, 5};
        int sum = 0;

        //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
