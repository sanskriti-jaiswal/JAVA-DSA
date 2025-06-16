package Arrays;

public class MaxSubarray {
    
    int maxSubarraySum(int[] arr) {
    //NAIVE METHOD
        int max=Integer.MIN_VALUE;
        int n= arr.length;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i;j<n; j++){
                    sum= sum+arr[j];
                    if(sum>max){
                        max= sum;
                    }
                
            }
        }
        return max;
    
}

        
}
