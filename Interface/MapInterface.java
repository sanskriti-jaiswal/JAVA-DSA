package Interface;
import java.util.*;
public class MapInterface{
    //hashmap, linkedhashmap, treemap(sortedmap)
    public static void main(String[] args) {
        //using interface name
        Map<Integer, String> mp= new HashMap();
        //OR using class name
        // HashMap<Integer, Sting> mp= new HashMap<>();
        mp.put(3, "aman");
        mp.put(1, "ram");
        mp.put(2, "riya");
        mp.put(1, "sita"); //over-rides
        mp.putIfAbsent(2, "adam");
        System.out.println(mp);
        System.out.println(mp.entrySet());//displays the map
        System.out.println(mp.get(2));
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("riya"));
        System.out.println(mp.keySet());
        System.out.println(mp.values());

        //iterating over keys in a map
        for(Integer i: mp.keySet()){
            System.out.println(i);
        }
        //iterating over values in a map
        for(String i: mp.values()){
            System.out.println(i);
        }
        //iterating over keys in a map without specifying the data type- only use var
        for(var i: mp.keySet()){
            System.out.println(i);
        }
        //iterating over values in a map without specifying the data type- only use var
        for(var i: mp.values()){
            System.out.println(i);
        }
        //iterate over key-value mapping
        for(var e: mp.entrySet()){
            System.out.println(e);
        }
        for(var e: mp.entrySet()){
            System.out.println(e.getKey());
        }
        for(var e: mp.entrySet()){
            System.out.println(e.getValue());
        }

        // Map<Integer, String> m= new LinkedHashMap<>();
        // m.put(3, "hello");
        // m.put(2, "h");
        // m.put(1, "he");
        // m.put(4, "hel");
        // System.out.println(m);

        Map<Integer, String> m= new TreeMap<>();
        //or TreeMap<Integer, String> m= new TreeMap<>();
        m.put(3, "hello");
        m.put(2, "h");
        m.put(1, "he");
        m.put(4, "hel");
        System.out.println(m);


    }
}