
//1234
//1234
//1234
//1234
import java.util.*;

public class Pattern2 {
    public static void row(int i, int n) {
        if (i <= n) {

            col(1, n);
            System.out.println();
            row(i + 1, n);
        }
    }

    public static void col(int j, int n) {
        if (j <= n) {
            System.out.print(j + "");
            col(j + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size ");
        int n = in.nextInt();
        row(1, n);

        in.close();
    }
}
