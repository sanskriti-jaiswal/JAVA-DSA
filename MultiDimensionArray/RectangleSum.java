package MultiDimensionArray;
import java.util.*;
public class RectangleSum {
    static int findSum(int [][]matrix,int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum+= matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows");
        int r= sc.nextInt();
        System.out.print("enter number of cols");
        int c= sc.nextInt();
        int arr[][]= new int[r][c];
        int totalElements= r*c;
        System.out.print("enter matrix elements");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    
    System.out.println("enter rectangle boundaries");
    System.out.println("l1");
    int l1= sc.nextInt();
    System.out.println("r1");
    int r1= sc.nextInt();
    System.out.println("l2");
    int l2= sc.nextInt();
    System.out.println("r2");
    int r2= sc.nextInt();
    System.out.println("sum of rectangles in the given boundaries"+ findSum(arr,l1,r1,l2,r2));
    }
}
