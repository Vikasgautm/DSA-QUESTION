
//sum of digit any number
import java.util.Scanner;

class Sum {
    int digit(int x) {
        int sum = 0;
        {

            while (x != 0) {
                return ((x % 10) + digit(x / 10));
            }
            return sum;
        }
    }
}

public class SumDigit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number");
        int n = in.nextInt();
        Sum ob = new Sum();
        System.out.println("your sum of digits=" + ob.digit(n));
        in.close();
    }
}
