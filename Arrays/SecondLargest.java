package Arrays;
import java.util.Scanner;
public class SecondLargest{
    static int findMax(int arr[]) {
        int max= Integer.MIN_VALUE;                   // MIN VALUE= -(infinity)
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
    static int findSecondMax(int arr[]) {
        int max= findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax= findMax(arr);
        return secondMax;
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
    System.out.println("The second largest element is: " + findSecondMax(arr));
    

    
    sc.close(); 
}
}