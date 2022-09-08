import java.util.Scanner;

public class Reverserowprinting {
    public static void main(String[] args) {
        int n, i, s, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
