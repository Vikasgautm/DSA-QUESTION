import java.util.Scanner;

public class Power {
    public static double Findpower(int x, int n) {
        // return Math.pow(x, n);
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any two x and n");
        int x = in.nextInt();
        int n = in.nextInt();
        double y = Findpower(x, n);
        System.out.println(" your power is x to n : " + y);
        in.close();
    }
}
