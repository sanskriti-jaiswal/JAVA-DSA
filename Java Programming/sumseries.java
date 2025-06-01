//1-2+3-4+5-6+7-8+9-10.....n
import  java.util.Scanner;
public class sumseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                sum=sum -i;
            }
            else{
                sum=sum+i;
            }
        }
        System.out.println("Sum of series is "+sum);

    }
}
