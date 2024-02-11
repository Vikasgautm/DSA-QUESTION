import java.util.Scanner;

public class GreatestValue {
    // public static int greatest(int a, int b) {
    // if (a > b) {
    // return a;
    // }
    // return b;
    // }
    public static boolean greatest(int a, int b) {
        if (a > b) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any two number  . .");
        int a = in.nextInt();
        int b = in.nextInt();
        // System.out.println(greatest(a, b));
        boolean great = greatest(a, b);
        if (great) {
            System.out.println(a + " is greatest ");
        } else {
            System.out.println(b + " is greatest  ");
        }
        in.close();
    }
}
