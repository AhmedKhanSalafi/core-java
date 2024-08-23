package map;


import java.util.Map;

public class TreeMap {



            public static void main(String args[]) {

                Map<String,Integer> tm = new java.util.TreeMap<>();
                tm.put("Ahmed", 1);
                tm.put("Rahul", 2);
              tm.put("Jai", 4);
                tm.put("Amit", 6);


                // Getting values from the tree map
                int valueA = tm.get("Ahmed"); // O(log n)
                System.out.println("Value of A: " + valueA);

                // Removing elements from the tree map
                tm.remove("Amit"); // O(log n)

                // Iterating over the elements of the tree map
                for (String key : tm.keySet()) { // O(n)
                    System.out.println(
                            "Key: " + key + ", Value: "
                                    +tm.get(key)); // O(log n) for each
                    // get operation
                }


    }
}