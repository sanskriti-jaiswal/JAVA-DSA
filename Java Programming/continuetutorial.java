import java.util.Scanner;
public class continuetutorial {
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);
        for(int num=1; num<50; num++){
            if(num%3==0){
                continue;
            }
            System.out.println(num);
        }
        }
}
