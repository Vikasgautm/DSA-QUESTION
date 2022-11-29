
// check paliondrome number using recurrsion..
import java.util.Scanner;

public class PalindromeNumber {
    static int Number(int n, int rev) {
        if (n == 0)
            return rev;
        rev = (rev * 10 + n % 10);
        return Number(n / 10, rev);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter any value ");
        int n = in.nextInt();
        int t = n, rev = 0;
        int y = Number(n, rev);
        if (y == t) {
            System.out.println(" your number is palindrome = " + t);
        } else {
            System.out.println("your numbe is not palindropme = " + t);
            in.close();
        }
    }
}
