import java.util.Scanner;
public class wherepointlies {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        if(x==0 && y==0){
            System.out.println("Point lies on origin");
        }
        else if(x==0){
            System.out.println("Point lies on y-axis");
        }
        else if(y==0){
            System.out.println("Point lies on x-axis");
        }
        else{
            System.out.println("Point lies on neither x-axis nor y-axis");
        }
    }
}
