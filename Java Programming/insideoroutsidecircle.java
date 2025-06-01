import java.util.Scanner;
import java.lang.Math;
public class insideoroutsidecircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x=1, y=1, r=5;
        double d= Math.sqrt((x1-x)*2+(y1-y)*2);
        if(d<r){
            System.out.println("Point lies inside the circle");
        }
        else if(d==r){
            System.out.println("Point lies on the circle");
        }
        else{
            System.out.println("Point lies outside the circle");
        }
    }
}
//Math.sqrt() returns a double value