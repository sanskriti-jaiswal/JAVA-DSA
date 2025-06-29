package HashMap;
import java.util.*;
public class HashMapMethods {
    public static void main(String[] args) {
        Map<String, Integer> mp= new HashMap<>();
        //insert elements
        mp.put("a",1);
        mp.put("c",20);
        mp.put("b",15);
        mp.put("e",10);
        mp.put("d",11);
        System.out.println(mp.get("d")); //pass the key
        System.out.println(mp.get("f"));  //returns null when key doesnt exist
        mp.put("a", 101); //over-rides the value
        System.out.println(mp.get("a"));
        System.out.println(mp.remove("a"));
        System.out.println(mp.remove("h"));
        System.out.println(mp);
        //traversing all entries 
        for(String key: mp.keySet()){
            System.out.printf("age of %s is %d\n",key, mp.get(key));
        }

    }
}
