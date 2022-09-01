import java.util.Scanner;

public class Rectanglearea {
    public static void main(String[] args) {
        int len, br, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length:");
        len = sc.nextInt();
        System.out.println("Enter breadth:");
        br = sc.nextInt();
        area = len * br;
        System.out.println("Area of rectangle:" + area);
    }
}
