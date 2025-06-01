
package Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ages:");
        int n = sc.nextInt();

        int ages[] = new int[n];
        int sum = 0;

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Enter the age of person " + (i + 1) + ":");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }

        System.out.println("The sum of ages is " + sum);
        sc.close(); // Best practice: close Scanner
    }
}
