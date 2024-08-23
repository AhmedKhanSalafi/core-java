package array;

import java.util.Arrays;

public class Code29 {

    //search for element using Array.binarySearch() method

    public static void main(String[] args) {


        // initializing unsorted int array
        int intArr[] = {10,20,15,22,35};

        // sorting array
        Arrays.sort(intArr);

        // let us print all the elements available in list
        System.out.println("The sorted int array is:");
        for (int number : intArr) {
            System.out.println("Number = " + number);
        }

        // entering the value to be searched
        int searchVal = 35;
        int retVal = Arrays.binarySearch(intArr,searchVal);
        System.out.println("The index of element 35 is : " + retVal);
    }


}
