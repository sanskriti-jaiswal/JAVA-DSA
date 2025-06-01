package Recursion;
import java.util.*;
public class SumOfFirstN {
    public static void printSum(int i, int n, int sum ){
        if(i==n){
            sum+= i;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        printSum(1,5,0);
    }
}
