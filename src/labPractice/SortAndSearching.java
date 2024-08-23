package labPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAndSearching {

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 1, 4, 2));
        Collections.sort(numbers); // Sort the list
        int index = Collections.binarySearch(numbers, 3); // Perform binary search
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");

        }

    }}