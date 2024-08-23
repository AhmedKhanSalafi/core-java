package array;

public class Code27 {

    //divide the given array into 2 arrays with even number and odd number

    public static void main(String[] args) {

        int arr[] = { 21, 53, 99, 9, 67, 66, 2, 91 };

        //get the length of the array
        int size = arr.length;

        //Logic for even array elements
        System.out.println("Even numbers are:");
        for(int i=0; i<size; i++){
            if(arr[i]%2==0){

                //separates even numbers
                System.out.print(arr[i]+" ");
            }
        }

        //Logic for odd array elements
        System.out.println("\nOdd numbers are:");
        for(int i=0; i<size; i++){
            if(arr[i]%2!=0){

                //separates odd numbers
                System.out.print(arr[i]+" ");
            }
        }

    }
}
