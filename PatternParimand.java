//    1
//   121
//  12321
// 1234321
//123454321

import java.util.*;

public class PatternParimand {
    public static void row(int i, int n) {
        if (i <= n) {
            space(1, i, n);
            col(1, i, n);
            ncol(i - 1, 1, n);
            System.out.println();
            row(i + 1, n);
        }
    }

    public static void space(int j, int i, int n) {
        if (j <= n - i) {
            System.out.print(" ");
            space(j + 1, i, n);
        }
    }

    public static void col(int j, int i, int n) {
        if (j <= i) {
            System.out.print(j);
            col(j + 1, i, n);
        }
    }

    public static void ncol(int j, int i, int n) {
        if (j >= 1) {
            System.out.print(j);
            ncol(j - 1, i, n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter any rows ");
        int n = in.nextInt();
        row(1, n);
        in.close();
    }
}
