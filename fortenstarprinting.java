import java.util.Scanner;

public class fortenstarprinting {
    public static void main(String[] args) {
        int n, i, s, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        n = sc.nextInt();
        // *count no. of rows */
        for (i = 1; i <= n; i++) {
            // *for space printing */
            for (s = 1; s <= n - i; s++)
                System.out.print(" ");

            // *star printing */
            for (j = 1; j <= 2 * i - 1; j++)

                System.out.print("*");

            System.out.println();
        }
        n = n - 1;
        for (i = 1; i <= 9; i++) {
            // *for space printing */
            for (s = 1; s <= i; s++)
                System.out.print(" ");

            // *star printing */
            for (j = 1; j <= 2 * (n - i) + 1; j++)

                System.out.print("*");

            System.out.println();
        }
    }
}
