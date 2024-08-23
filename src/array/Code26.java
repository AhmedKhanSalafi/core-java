package array;

import java.util.Arrays;

public class Code26 {

    //create array with even number


        public static void main(String[] args) {
            int max = 10; // Define the maximum value
            int[] evenNumbers = new int[(max / 2) * 2]; // Create an array of even lengths up to max
            for (int i = 0; i < evenNumbers.length; i++) {
                evenNumbers[i] = max - i * 2; // Fill the array with even numbers
            }
            System.out.println(Arrays.toString(evenNumbers)); // Print the result
        }




    }

