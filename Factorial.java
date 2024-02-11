import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number whose find factorial : ");
        int n = in.nextInt();
        System.out.println(fact(n));
        in.close();
    }
}
