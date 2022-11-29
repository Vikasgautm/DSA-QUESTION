
//1
//22
//333
//4444
//55555
import java.util.*;

public class pattern4 {
    public static void row(int i, int n) {
        if (i <= n) {

            col(1, i);
            System.out.println();
            row(i + 1, n);
        }
    }

    public static void col(int j, int i) {
        if (j <= i) {
            System.out.print(i);
            col(j + 1, i);
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
