package PrefixSum;
import java.util.Scanner;

public class SumOfIndecies {

    static void printArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) { // 1-based indexing
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray1Based(int arr[]) {
        int n = arr.length;
        int pref[] = new int[n + 1]; // extra space for 1-based indexing
        
        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i - 1] + arr[i - 1]; // arr is still 0-based
        }
        return pref;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans[] = makePrefixSumArray1Based(arr);
        System.out.println("\nPrefix sum array (1-based index):");
        printArray(ans);

        System.out.print("\nEnter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter the range (l r): ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (l < 1 || r > n || l > r) {
                System.out.println("Invalid range! Use 1 ≤ l ≤ r ≤ " + n);
            } else {
                System.out.println("Sum of elements from index " + l + " to " + r + " is: " + (ans[r] - ans[l - 1]));
            }
        }

        sc.close();
    }
}
