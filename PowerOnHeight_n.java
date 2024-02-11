import java.util.Scanner;

public class PowerOnHeight_n {
    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // return x * Power(x, n - 1);// when stack is up
        return Power(x, n - 1) * x;// whwn stack is down

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter  thopse number whome number find of power");
        int x = in.nextInt();
        System.out.println("enter power of number ");
        int n = in.nextInt();
        System.out.println(Power(x, n));
    }
}
