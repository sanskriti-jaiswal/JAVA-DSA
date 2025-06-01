import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking binary input from user
        System.out.print("Enter a binary number: ");
        int binaryNum = sc.nextInt();
        int power= 1;
        int ans= 0;
        
       while(binaryNum>0){
        int lastDigit= binaryNum%10;
        ans+= lastDigit*power;
        power*=2;
        binaryNum/=10;

       }
         System.out.println("Decimal number is: "+ans);
    }
}
