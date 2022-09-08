import java.util.Scanner;

public class Pyramidreverseadd {
    public static void main(String[] args) {
        int n, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        n = sc.nextInt();
        for (; n >= 1; n--) {
            for (j = 1; j <= n; j++) {
                System.out.print(n + j);
            }
            System.out.println();
        }
    }
}
