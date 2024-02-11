import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter terms ");
        int n = in.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " ");
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                int temp = b;
                b = a + b;
                a = temp;
            }
        }
        in.close();
    }
}
