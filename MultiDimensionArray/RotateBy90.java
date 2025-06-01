package MultiDimensionArray;
import java.util.*;
public class RotateBy90 {
    static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transposeInplace(int arr[][], int r, int c){
        for(int i=0; i<r; i++){
            for(int j=i; j<c; j++){
                if (r != c) {
                    System.out.println("In-place transpose only works for square matrices.");
                    return;
                }else{
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
                }
            }
        }
    }

    static void reverseArray(int arr[]){
        int i=0; int j= arr.length-1;
        while(i<j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++; j--; 
        }
    }

    static void rotateInplace(int arr[][], int n){
        //transpose
        transposeInplace(arr,n,n);
        for(int i=0; i<n; i++){
            reverseArray(arr[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows");
        int r= sc.nextInt();
        System.out.print("enter number of cols");
        int c= sc.nextInt();
        int arr[][]= new int[r][c];
        int totalElements= r*c;
        System.out.print("enter array elements");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("original array");
        printArray(arr);

        System.out.println("rotated inplace array");
        rotateInplace(arr,r);
        printArray(arr);
    }
}
