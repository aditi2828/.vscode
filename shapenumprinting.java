import java.util.Scanner;

public class shapenumprinting {
    public static void main(String[] args) {
        int n, i, b, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        n = sc.nextInt();
        // *commit no. of rows */
        for (i = 1; i <= n; i++) {
            // *for space printing */
            for (b = 1; b <= n - i; b++) {
                System.out.print(" ");
            }
            // *star printing */
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
