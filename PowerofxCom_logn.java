import java.util.Scanner;

public class PowerofxCom_logn {
    public static int findpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return findpower(x, n / 2) * findpower(x, n / 2);
        } else
            return findpower(x, n / 2) * findpower(x, n / 2) * x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter those number whose nuber find ythe power ");
        int x = in.nextInt();
        System.out.println("enter power");
        int n = in.nextInt();
        System.out.println(findpower(x, n));
    }
}
