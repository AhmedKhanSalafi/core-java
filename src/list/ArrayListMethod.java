package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethod {

    public static void main(String[] args) {


        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);


        //Traversing list through Iterator
//        Iterator itr=list.iterator();//getting the Iterator
//        while(itr.hasNext()){//check if iterator has the elements
//            System.out.println(itr.next());//printing the element and move to next
//        }
//

        //accessing the element
        System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0
        //changing the element
        list.set(1,"Dates");
        System.out.println(list);

        Collections.sort(list);
        //Traversing list through the for-each loop
        for(String frt:list)
            System.out.println(frt);
    }
}

