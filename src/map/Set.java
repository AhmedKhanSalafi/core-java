package map;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

    public static void main(String[] args) {

        HashSet<Integer> set= new HashSet<>();
        set.add(3);
        set.add(6);
        set.add(1);
        set.add(4);

        if (set.contains(1)){
            System.out.println("set contain 1");
        }
        if (!set.contains(7)){
            System.out.println("set not contain 7");
        }

       Iterator itr= set.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
