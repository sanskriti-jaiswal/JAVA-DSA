import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimalNum = sc.nextInt();
        int power=1;
        int ans=0;
        while(decimalNum>0){
            int parity= decimalNum%2;
            ans+= parity*power;
            power*=10;
            decimalNum/=2;
        }
        System.out.println("Binary number is: "+ans);
    


    }
}
