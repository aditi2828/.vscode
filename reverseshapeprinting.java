import java.util.Scanner;

public class reverseshapeprinting {
    public static void main(String[] args) {
        int n, i, b, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        n = sc.nextInt();
        // *commit no. of rows */
        for (i = 1; i <= n; i++) {
            // *for space printing */
            for (b = 1; b < i; b++) {
                System.out.print(" ");
            }
            // *star printing */
            for (j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
