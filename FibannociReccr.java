import java.util.Scanner;

public class FibannociReccr {
    public static void printfibb(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(" " + c);
        printfibb(b, c, n - 1);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter term ");
        int n = in.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        printfibb(a, b, n - 2);

    }
}
