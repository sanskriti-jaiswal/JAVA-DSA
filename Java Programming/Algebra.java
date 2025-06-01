import java.util.Scanner;

class constructortutorial {
    int x, y;

    // Default constructor
    constructortutorial() {
        System.out.println("Default constructor");
    }

    // Parameterized constructor
    constructortutorial(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("This is a constructor");
    }

    // Add method with parameters
    int add(){
        int ans = x + y;
        return ans;
    }

    // Subtract using instance variables
    int sub(){
        int ans = x - y;
        return ans;
    }

    // Multiply using instance variables
    int mul(){
        int ans = x * y;
        return ans;
    }
}

public class Algebra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        constructortutorial obj = new constructortutorial(); // Calls default constructor
        constructortutorial obj1 = new constructortutorial(x, y); // Calls parameterized constructor

        int resultAdd = obj.add();
        int resultSub = obj1.sub();
        int resultMul = obj1.mul();

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSub);
        System.out.println("Multiplication: " + resultMul);

        sc.close();
    }
}
