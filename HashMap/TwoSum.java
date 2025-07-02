import java.util.*;
public class TwoSum {
    //APPROACH 1
    //TC= O(n^2)
    // public int[] twoSum(int[] nums, int target){
    //     int n= nums.length;
    //     int[] ans= {-1}; //initialize ans array with -1
    //     for(int i=0; i<n; i++){        
    //         for(int j=i+1; i<n; i++){
    //             if(nums[j]== target- nums[i]){
    //                 ans= new int[]{i,j}; //i and j can be in any order
    //                 return ans;
    //             }
    //         }
    //     }
    //     return ans;     //if pair desnt exist will return -1.
    // }

    //OR
    //TC= O(n^2)
    class Solution {
    public int[] twoSum1(int[] nums, int target){
        int n = nums.length;
        int[] ans = new int[2]; // default is [0, 0], will update if found
        for(int i = 0; i < n; i++){        
            for(int j = i + 1; j < n; j++){
                if(nums[j] == target - nums[i]){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return new int[]{-1}; // if no pair is found
    }
}
//APPROACH 2
//TRAVERSING ON ARRAY AND APPLYING BINARY SEARCH TO FIND (TARGET- ELEMENT) IN REST OF THE ARRAY
//TC= O(nlog) for sorting O(logn) for binary search
//TC= O(nlogn)

//APPROAACH 3- MOST EFFICIENT
//TC= O(n)
public int[] twoSum(int[] nums, int target){
    int n=nums.length;
    int[] ans= {-1};
    HashMap<Integer, Integer> mp= new HashMap<>();
    for(int i=0; i<n; i++){
        int partner= target- nums[i];
        if(mp.containsKey(partner)){  //if partner in map
            ans= new int[]{i, mp.get(partner)};
            return ans;
        }
        mp.put(nums[i], i);    //if partner not in map, insert the current element in map
    }
    return ans;     //returns -1 if pair not found
}
}
