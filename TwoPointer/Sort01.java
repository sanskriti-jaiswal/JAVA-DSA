package TwoPointer;
import java.util.Scanner;
public class Sort01 {
static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
static void sort01(int arr[]){
    int n= arr.length;
    int zeroes=0;  //COUNT OF ZEROES
    for(int i=0; i<n; i++){
        if(arr[i]==0){
            zeroes++;
        }
    }
    for(int i=0; i<zeroes; i++){
        arr[i]=0;
    }
    for(int i=zeroes; i<n; i++){
        arr[i]=1;
    }
    printArray(arr);
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
        System.out.println("\nAfter sorting the array: ");
        sort01(arr);
        sc.close(); // Close scanner to prevent resource leak
    }
}
