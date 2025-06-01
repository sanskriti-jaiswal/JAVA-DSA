package MultiDimensionArray;
import java.util.*;

public class MatrixAddition {

    static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
           System.err.println();
        } 
        
    }

    static void addArray(int[][]a, int[][]b, int r1, int r2, int c1, int c2 ){
        if(r1!= r2 || c1!=c2){
            System.out.println("addition not possible");
            return ;
        }
        int sum[][]= new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j]= a[i][j]+ b[i][j];
            }
        }
        printArray(sum);

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int r1= sc.nextInt();
        System.out.println("enter no of cols");
        int c1= sc.nextInt();
        int array1[][]= new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.println("enter array elements");
                array1[i][j]= sc.nextInt();
            }

        }
        System.out.println("matrix1;");
        printArray(array1);

        System.out.println("enter no of rows");
        int r2= sc.nextInt();
        System.out.println("enter no of cols");
        int c2= sc.nextInt();
        int array2[][]= new int[r2][c2];
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                System.out.println("enter array elements");
                array2[i][j]= sc.nextInt();
            }

        }
        System.out.println("matrix2;");
        printArray(array2);
       
        System.out.println("addition matrix:");
        addArray(array1, array2, r1, r2,c1,c2);

        
        // printArray(array1);
        // int arr[][]= {{1,2,3}, {4,5,6}, {7,8,9} };
        // printArray(arr);


    }
}
