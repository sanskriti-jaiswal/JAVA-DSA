package Arrays;
import java.util.Scanner;
public class FirstRepeatingNumber{
    static int firstRepeatingNumber(int arr[]) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];            //the whole method is stopped, using break will only stop the iteration
                }
            }
            
        }
        return -1;
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
    
    int result = firstRepeatingNumber(arr);
    if(result==-1){
        System.out.println("No repeating element found");
    }
    else{
        System.out.println("The first repeating element is: " + result);
    }
    
    
    sc.close(); // Close scanner to prevent resource leak
}
}
