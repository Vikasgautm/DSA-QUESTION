import java.util.Scanner;

public class GCd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter two numbers ");
        int a = in.nextInt();
        int b = in.nextInt();
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("your gcd values are : " + b);
        in.close();
    }
}
