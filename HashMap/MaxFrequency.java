package HashMap;
import java.util.*;
public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr={1,4,4,5,6,2,7,8,4,5,4};
        Map<Integer, Integer> freq= new HashMap<>();
        for(int el: arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else{
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println("frequency map");
        System.out.println(freq.entrySet());
        int maxFreq=0, ansKey=-1;
        // for(var e : freq.entrySet()){
        //     if(e.getValue()>maxFreq){
        //         maxFreq= e.getValue();
        //         ansKey= e.getKey();
        //     }
        // }
        //OR
        for(var key: freq.keySet()){
            if(freq.get(key)> maxFreq){
                maxFreq= freq.get(key);
                ansKey= key;
            }
        }

        System.out.printf("element %d has max frequencyy and it ocuurs %d times", ansKey, maxFreq);
    }
}
