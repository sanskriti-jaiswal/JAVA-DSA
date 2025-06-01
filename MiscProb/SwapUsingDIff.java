package MiscProb;

public class SwapUsingDIff {
    static void swapping(int a, int b) {
        //USING ADDING AND SUBTRACTING
        // This method works only for positive integers
        // and will not work for negative integers or zero.
        System.out.println("Before swapping: a= " + a + " b= " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a= " + a + " b= " + b);

    }
public static void main(String[] args) {
    int a= 10;
    int b= 20;
    swapping(a, b);
}
}