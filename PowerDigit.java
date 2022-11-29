
import java.util.Scanner;

class Power {
    int pow(int n, int p) {
        if (p == 0)
            return 1;
        else {
            return (n * pow(n, p - 1));
            // int l = n * m;
            // return l;
        }
    }
}

public class PowerDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number and his power");
        int n = in.nextInt();
        int p = in.nextInt();
        Power ob = new Power();
        int y;
        y = ob.pow(n, p);
        System.out.println(" your power of numbeer= " + y);
        in.close();
    }
}
