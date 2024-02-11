import java.util.Scanner;

public class SprialMatrix {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("enter rows ");
        // int n = in.nextInt();
        // System.out.println("enter colums ");
        // int m = in.nextInt();
        // int a[][] = new int[n][m];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // a[i][j] = in.nextInt();
        // }
        // }
        int a[][] = {
                { 2, 3, 5 },
                { 4, 5, 6 },
                { 5, 7, 8 },
        };
        int n = a.length;
        int m = a[0].length;
        int startrow = 0, endrow = n - 1, startcol = 0, endcol = m - 1;
        while (startrow <= endrow && startcol <= endcol) {
            for (int col = startcol; col <= endcol; col++) {
                System.out.print(a[startrow][col] + " ");
            }
            startrow++;
            for (int row = startrow; row <= endrow; row++) {
                System.out.print(a[row][endcol] + " ");
            }
            endcol--;
            for (int col = endcol; col >= startcol; col--) {
                System.out.print(a[endrow][col] + " ");
            }
            endrow--;
            for (int row = endrow; row >= startrow; row--) {
                System.out.print(a[row][startcol] + " ");
            }
            startcol++;
        }
        // in.close();
    }
}
