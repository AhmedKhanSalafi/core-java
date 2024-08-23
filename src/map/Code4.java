package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Code4 {

    public static void main(String[] args) {

        Map<Integer,String> tm= new TreeMap<>();
        tm.put(1,"Ahmed");
        tm.put(3,"Rahul");
        tm.put(5,"angel");
        tm.put(4,"suresh");

        System.out.println(tm);


        for (Map.Entry<Integer,String> entry: tm.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
