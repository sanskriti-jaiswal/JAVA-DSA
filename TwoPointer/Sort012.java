package TwoPointer;
import java.util.*;
class Sort012 {
    // Function to sort an array of 0s, 1s, and 2s
    //NOT TIME OPTIMIZED
    public static void sort012(int[] arr) {
        int zeroes=0;
        int ones= 0;
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                zeroes++;
            }
            else if(arr[i]==1){
                ones++;
            }
        }
        for(int i=0; i<zeroes; i++){
            arr[i]=0;
        }
        for(int i=zeroes; i<zeroes+ones; i++){
            arr[i]=1;
        }
        for(int i=zeroes+ones; i<n; i++){
            arr[i]=2;
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
                System.out.print(arr[i]+" ");
            }
    }
}