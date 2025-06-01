package Arrays;
import java.util.*;

public class TripleSum {
    static int ans = 0;
    
    static int findTripleSum(int arr[], int target) {
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                        System.out.println("The target sum is found at index " + i + " and " + j + " and " + k);
                    }
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
        int target = sc.nextInt();


        int result = findTripleSum(arr, target);
        System.out.println("Total triplets found: " + result);
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
