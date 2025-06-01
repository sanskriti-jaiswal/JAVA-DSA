package MultiDimensionArray;
import java.util.*;
public class GenerateSpiral{
    static void printMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n){
        int[][] matrix= new int[n][n];
        int curr=1;
        
        int toprow=0, botrow= n-1, leftcol=0, rightcol= n-1;
        while(curr<=n*n){
            //toprow -> leftcol to rightcol
            for(int j=leftcol; j<=rightcol && curr<=n*n ; j++){
                matrix[toprow][j]= curr++;
            }
            toprow++;
            //rightcol-> toprow to botrow
            for(int i=toprow; i<=botrow && curr<=n*n; i++){
                matrix[i][rightcol]= curr++;
            }
            rightcol--;
            //botrow-> rightcol to leftcol
            for(int j=rightcol; j>=leftcol && curr<=n*n; j--){
                matrix[botrow][j]= curr++;
            }
            botrow--;
            //leftcol-> botrow to toprow
            for(int i=botrow; i>=toprow && curr<=n*n; i--){
                matrix[i][leftcol]= curr++;
            }
            leftcol++;

    }
    return matrix; 
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
        int[][] matrix= generateSpiralMatrix(n);
        printMatrix(matrix);
    }
}