package PrefixSum;
import java.util.Scanner;
public class PrefixSumArray {
    
static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

static int [] makePrefixSumArray(int arr[]) {
    int n = arr.length;
    int pref[] = new int[n];
    pref[0] = arr[0];
    for (int i = 1; i < n; i++) {
        pref[i] = pref[i - 1] + arr[i];
    }
    return(pref);
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
    
    int ans[] = makePrefixSumArray(arr);
    System.out.print("\nPrefix sum array: ");
    printArray(ans);
    
    sc.close(); // Close scanner to prevent resource leak
}
}
