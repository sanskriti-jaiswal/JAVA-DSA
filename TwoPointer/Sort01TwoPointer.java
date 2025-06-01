package TwoPointer;
import java.util.Scanner;

public class Sort01TwoPointer {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort01(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            } if (arr[left] == 0) {
                left++;
            } if (arr[right] == 1) {
                right--;
            }
        }
        return;
        
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
        
        System.out.println("The original array is: ");
        printArray(arr);
        
        System.out.println("After sorting the array: ");
        sort01(arr);
        printArray(arr);
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
