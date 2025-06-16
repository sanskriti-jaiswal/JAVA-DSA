package TwoPointer;

import java.util.*;
class Sort012TwoPointer {
    // Function to sort an array of 0s, 1s, and 2s
// If arr[mid] == 0: swap with arr[low], and move both forward.

// If arr[mid] == 1: just move mid forward.

// If arr[mid] == 2: swap with arr[high]  and move high backward without incrementing mid, because the swapped value could be 0 or 1.
    public static void sort012(int[] arr) {
        int n= arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp= arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++; 
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp= arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
            
        }
        
        return;
    }
        // code here
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("size of array");
            int n= sc.nextInt();
            int[] arr= new int[n];
            System.out.println("elements of array");
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            sort012(arr);
            for(int i=0; i<n; i++){
                System.out.println(arr[i]+" ");
            }
    }
}