package PrefixSum;
import java.util.Scanner;
public class EqualSumPartition {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int findArraySum(int arr[]) {
        int n = arr.length;
        int totalsum = 0;
        for (int i = 0; i < n; i++) {
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equalSumPartition(int[] arr){
       int totalsum = findArraySum(arr);
       int prefsum = 0;
         for (int i = 0; i < arr.length; i++) {
              prefsum += arr[i];
              int suffsum= totalsum - prefsum;
              if (suffsum == prefsum) {
                return true;
              }
             
         }
            return false;
    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    
    System.out.println("Enter the elements of the array");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    
    System.out.println("The original array is: ");
    printArray(arr);
    

    System.err.println("Equal sum partition is possible: " + equalSumPartition(arr));
    
    sc.close(); // Close scanner to prevent resource leak
}
}