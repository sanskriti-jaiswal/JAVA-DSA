package MultiDimensionArray;
import java.util.*;
public class PrintSpiral{
    static void printMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int [][]matrix, int r, int c){
        int totalElements= 0;
        int toprow=0, botrow= r-1, leftcol=0, rightcol= c-1;
        while(totalElements<r*c){
            //toprow -> leftcol to rightcol
            for(int j=leftcol; j<=rightcol && totalElements<r*c ; j++){
                System.out.print(matrix[toprow][j]+" ");
                totalElements++;
            }
            toprow++;
            //rightcol-> toprow to botrow
            for(int i=toprow; i<=botrow && totalElements<r*c; i++){
                System.out.print(matrix[i][rightcol]+" ");
                totalElements++;
            }
            rightcol--;
            //botrow-> rightcol to leftcol
            for(int j=rightcol; j>=leftcol && totalElements<r*c; j--){
                System.out.print(matrix[botrow][j]+" ");
                totalElements++;
            }
            botrow--;
            //leftcol-> botrow to toprow
            for(int i=botrow; i>=toprow && totalElements<r*c; i--){
                System.out.print(matrix[i][leftcol]+" ");
                totalElements++;
            }
            leftcol++;

        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows");
        int r= sc.nextInt();
        System.out.print("enter number of cols");
        int c= sc.nextInt();
        int arr[][]= new int[r][c];
        System.out.print("enter array elements");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("original array");
        printMatrix(arr);
        System.out.println("spiral order in matrix");
        printSpiralOrder(arr,r,c);
        
    }
}