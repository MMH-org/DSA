package Src.DSA.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapInJava {
    public static void main(String[] args) {
//        System.out.println("HashMap in Java");

        //Creating HashMap in Java
        HashMap<String,Integer> mapUserDefineName = new HashMap<>();

//        Insertion
        mapUserDefineName.put("India",120);
        mapUserDefineName.put("US", 30);
        mapUserDefineName.put("China", 150);

//        System.out.println(mapUserDefineName);

        mapUserDefineName.put("China",180);
//        System.out.println(mapUserDefineName);


        // Search
        if (mapUserDefineName.containsKey("China")){
          //  System.out.println("key is present in the map");
        }else {
            //System.out.println("key is not present in the map");
        }

        // System.out.println(mapUserDefineName.get("China"));
        //System.out.println(mapUserDefineName.get("UK"));

        // for loop type
        int[] arr ={12,13,45};
        // first type
        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
        }
        System.out.print("\n"); //line change

        //second type
        for(int value_of_Arr:arr){
//            System.out.print(value_of_Arr+" ");
        }

        // hashMap iteration
        for (Map.Entry<String,Integer> e :mapUserDefineName.entrySet()){
            // e => key as well as value both are hold in e variable
//            System.out.print(e.getKey()+" ");
//            System.out.print(e.getValue()+" ");
//            System.out.println();
        }

        Set<String> keys = mapUserDefineName.keySet();
        for(String key :keys){
        //   System.out.print(key+ " "+mapUserDefineName.get(key));
        }

        // remove key and its value
        mapUserDefineName.remove("China");
        // System.out.println(mapUserDefineName);

    }
}
