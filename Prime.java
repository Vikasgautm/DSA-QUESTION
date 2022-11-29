
import java.util.Scanner;

public class Prime {
    public static int prime(int n, int i) {
        if (i == 1)
            return 1;
        if (n % i == 0)
            return 0;
        return prime(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter any number...");
        int n = in.nextInt();
        int p = prime(n, n / 2);
        if (p == 1)
            System.out.println(" your number is prime = " + n);
        else
            System.out.println(" your number is not prime ");
        in.close();
    }
}
