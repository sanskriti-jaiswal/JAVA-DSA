import java.util.Scanner;
class methodtutorial {
    public int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        methodtutorial obj = new methodtutorial();
        int result = obj.sum(a, b);
        System.out.println(result);

    }

}