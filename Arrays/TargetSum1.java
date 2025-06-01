package Arrays;
import java.util.*;

public class TargetSum1 {
    static int ans = 0;
    
    static int findTargetSum(int arr[], int target) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                    System.out.println("The target sum is found at index " + i + " and " + j);
                }
            }
        }
        if (ans == 0) {
            System.out.println("The target sum is not found");
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum");
        int x = sc.nextInt();
        
        int result = findTargetSum(arr,x);
        System.out.println("Total pairs found: " + result);
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
//we are finding a pair here whose sum is equal to target