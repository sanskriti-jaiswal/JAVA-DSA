import java.util.*;
public class IsomorphicStrings {
    public boolean isIsomorphic1(String s, String t){
        //APPROACH 1
        //USING HASHMAP
        //TOTAL TC= O(n^2) = quadratic 
        HashMap<Character, Character> mp= new HashMap<>();
        for(int i=0; i<s.length(); i++){        //TC= O(n)   depends on length of string- linear time
            Character sch= s.charAt(i);
            Character tch= t.charAt(i);
            if(mp.containsKey(sch)){
                if(mp.get(sch)!= tch){
                    return false;
                }
            }
                else if (mp.containsValue(tch)){           //containsValue function in Map takes linear time O(n)
                    return false;
                }
                else{
                    mp.put(sch, tch);
                }       
        }
        return true;
    }

    //APPROACH 2
    //WE CAN DO THIS USING HASHSET to optimize time
    public boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> mp= new HashMap<>();
        HashSet<Character> st= new HashSet<>();   //we are using extra space here but time complxity decreases
        for(int i=0; i<s.length(); i++){          //O(n)
            Character sch= s.charAt(i);
            Character tch= t.charAt(i);
            if(mp.containsKey(sch)){
                if(mp.get(sch)!= tch){
                    return false;
                }
            }
            else{
                if (st.add(tch)){           //add function in HashSet takes constant time O(1)
                    return false;
            }
            else{
                    mp.put(sch, tch);
                    st.add(tch);
            }       
            } 
        }
        return true;
        }
}

