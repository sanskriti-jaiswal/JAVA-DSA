package MultiDimensionArray;
import java.util.*;
public class PascalTriangle{
    static void printMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    static int[][] pascal(int n){
        int [][] ans= new int[n][];
        for(int i=0; i<n; i++){
            ans[i]= new int[i+1];      //every ith row has i+1 columns
            ans[i][0]= ans[i][i] = 1;  //every row first and last ele=1

            for(int j=1; j<i; j++){    //index 1 and i are already occupi ed
                ans[i][j]= ans[i-1][j]+ ans[i-1][j-1]; 
            }
        }
    return ans;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();

        int ans[][]= pascal(n);
        printMatrix(ans);
        
    }
}