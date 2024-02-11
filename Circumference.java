import java.util.Scanner;

public class Circumference {
    public static double circum(double r) {
        return 2 * 3.14 * 7;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter radious of circule   ");
        double r = in.nextDouble();
        System.out.println("your circumference of circule " + circum(r));
        in.close();
    }
}
