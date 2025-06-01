package MultiDimensionArray;
import java.util.*;
public class MatrixMultiplication{
    static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
           System.out.println();
        } 
        
    }

    static void mulArray(int[][]a, int[][]b, int r1, int r2, int c1, int c2 ){
        if(c1!=r2){
            System.out.println("Multiplication not possible");
            return;
        }
        int [][]ans= new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){          //k= Number of additions in each loop which is equal  to c1 or r2 
                    ans[i][j]+= a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication;");
        printArray(ans);
    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows");
        int r1= sc.nextInt();
        System.out.print("enter number of cols");
        int c1= sc.nextInt();
        int arr1[][]= new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print("enter the elements of array");
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix1;");
        printArray(arr1);

        System.out.println("enter no of rows");
        int r2= sc.nextInt();
        System.out.println("enter no of cols");
        int c2= sc.nextInt();
        int arr2[][]= new int[r2][c2];
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                System.out.print("enter array elements");
                arr2[i][j]= sc.nextInt();
            }

        }
        System.out.println("matrix2;");
        printArray(arr2);
       
        
        mulArray(arr1, arr2, r1, r2,c1,c2);



    }
}