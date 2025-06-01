package Arrays;
import java.util.*;

public class FindUnique {
    static int findUnique(int arr[]) {
        int unique = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                    arr[i] = -1;
                    break;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                unique = arr[i];
            }
        }
        return unique;
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
        
        int result = findUnique(arr);
        System.out.println("The unique element is: " + result);
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
