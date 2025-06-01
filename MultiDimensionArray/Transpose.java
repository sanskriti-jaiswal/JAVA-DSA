package MultiDimensionArray;
import java.util.*;
public class Transpose {
    static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // static int[][] transposeMatrix(int arr[][], int r, int c){
    //     int[][] transposed= new int[c][r];
    //     for(int i=0; i<r; i++){
    //         for(int j=0; j<c; j++){
    //            transposed[j][i] = arr[i][j];
    //         }
    //     }
    //     return transposed; 
    // }
    
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

        System.out.println("transposed inplace array");
        transposeInplace(arr,r,c);
        printArray(arr);

        // int[][] transposed= transposeMatrix(arr, r, c);
        // System.out.println("transposed array");
        // printArray(transposed);
    }
}
