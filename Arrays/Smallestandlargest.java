package Arrays;
import java.util.Scanner;

import java.util.Arrays;

public class Smallestandlargest {
    void findminmax(int arr[])
    {
        //using Arrays.sort() method
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSmallest element is "+arr[0]);
        System.out.println("Largest element is "+arr[arr.length-1]);
        int[] ans= {arr[0], arr[arr.length-1]};
        System.out.println("Smallest and largest element is "+Arrays.toString(ans)); //JAVA DOESNT PRINT THE ARRAY DIRECTLY - USE Arrays.toString()

    }
    public static void main(String[] args) {
        int arr[]={12, 34, 56, 78, 90, 23, 45, 67, 89, 100};
        Smallestandlargest obj=new Smallestandlargest();
        obj.findminmax(arr);
    }
}
