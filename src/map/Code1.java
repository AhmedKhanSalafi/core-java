package map;

import java.util.*;

public class Code1 {

    public static void main(String[] args) {


        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Ahmed");
        hm.put(5, "Rahul");
        hm.put(2, "Jai");
        hm.put(6, "Amit");

////Traversing Map
//    Set set=map.entrySet();//Converting to Set so that we can traverse
//    Iterator itr=set.iterator();
//    while(itr.hasNext()){
//        //Converting to Map.Entry so that we can get key and value separately
//        Map.Entry entry=(Map.Entry)itr.next();
//        System.out.println(entry.getKey()+" "+entry.getValue());
//    }
//
//        for (Map.Entry<Integer,String>entry: hm.entrySet()){
//
//            System.out.println(entry.getKey()+" "+entry.getValue());

      //  System.out.println(hm.containsValue("Ahmed"));
      //  System.out.println(hm.containsKey(1));

        //System.out.println(hm.hashCode());
      //  System.out.println(hm.isEmpty());
     //   System.out.println(hm.replace(2,"Rahul"));
      //  System.out.println(hm);
       // System.out.println(hm.remove(2));
      //  System.out.println(hm);

      //  System.out.println(hm.size());
        System.out.println(hm.keySet());

        }
    }
