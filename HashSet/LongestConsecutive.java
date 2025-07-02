package HashSet;
import java.util.*;
public class LongestConsecutive {
    public int longestConsecutive(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        int maxStreak=0;
        for(int num: nums){       //add the elemets to set
            st.add(num);
        }

        for(int num: st){        //traverse the set
            if(!st.contains(num-1)){    //it is starting point
                int currNum= num;
                int currStreak=1;       //length of current consecutive sequence
                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak= Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }
}
