
// check the number is power of 2 or not 
import java.util.Scanner;

public class Powecheck {
    static boolean check(int n) {
        if (n == 1) {
            return true;
        } else if (n % 2 != 0 || n == 0) {
            return false;
        }
        return check(n / 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number ");
        int n = in.nextInt();
        boolean y = check(n);
        if (y == true) {
            System.out.println(" your number is power of 2");
        } else {
            System.out.println(" your number is not power of 2...");
        }
        in.close();
    }
}
