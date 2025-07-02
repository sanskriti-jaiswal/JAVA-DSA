import java.util.*;
public class ValidAnagram {
    //APPROACH 1-> USING 2 MAPS
    static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer> mp= new HashMap<>();
        for(int i=0; i<str.length(); i++){
            Character ch= str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }else{
                int currFreq= mp.get(ch);
                mp.put(ch, currFreq+1);
            }
        }
        return mp;
    }
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> mp1= makeFreqMap(s);
        HashMap<Character,Integer> mp2= makeFreqMap(t);
        return mp1.equals(mp2);
    }


    //APPROACH 2 -> USING ONLY ONE  MAP
    public boolean isAnagram2(String s, String t){
        if(s.length()!=t.length()){      //check length 
            return false;
        }
        HashMap<Character,Integer> mp= makeFreqMap(s); //make one map for string s
        //traverse the second string
        for(int i=0; i<t.length(); i++){  //traverse in second string
            Character ch= t.charAt(i);
            if(!mp.containsKey(ch)){       //if char isnt key in map return false
                return false;
            }
            int currFreq=mp.get(ch);       //else take out the current freq of key
            mp.put(ch,currFreq-1);         //decrement the freq it should become zero if anagram
        }
        for(Integer i: mp.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
 