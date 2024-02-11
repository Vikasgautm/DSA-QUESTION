
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
import java.util.Scanner;

public class ButterFully {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter row ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
