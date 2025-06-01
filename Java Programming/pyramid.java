import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            // Print spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line
        }

        sc.close(); // Close the scanner to prevent resource leak
    }
}
