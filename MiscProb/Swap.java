package MiscProb;

public class Swap {
    static void swapping(int a, int b) {
        //USING TEMPORARY VARIABLE
        System.out.println("Before swapping: a= " + a + " b= " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a= " + a + " b= " + b);

    }
public static void main(String[] args) {
    int a= 10;
    int b= 20;
    swapping(a, b);
    
}

}