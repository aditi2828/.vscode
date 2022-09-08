import java.util.Scanner;

public class Starnumberprinting {
    public static void main(String[] args) {
        int n, i, s, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        n = sc.nextInt();
        // *commit no. of rows */
        for (i = 1; i <= n; i++) {
            // *for space printing */
            for (s = 1; s < i; s++) {
                System.out.print(" ");
            }
            // *star printing */
            for (j = 1; j <= n + 1 - i; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
