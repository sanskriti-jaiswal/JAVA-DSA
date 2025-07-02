import java.util.*;
public class LargestSubarray {
    int zeroSumLargestSubarray(int[] arr){
        // code here
        HashMap<Integer, Integer> mp= new HashMap<>(); //prefixSum, index
        int maxLeng=0;
        int prefSum=0;
        mp.put(0, -1);  //by default
        for(int i=0; i<arr.length; i++){
            prefSum+= arr[i];
            if(mp.containsKey(prefSum)){
                maxLeng=Math.max(maxLeng,i- mp.get(prefSum));
            }else{
                mp.put(prefSum,i);
            }
        }
        return maxLeng;
    
    }
}
