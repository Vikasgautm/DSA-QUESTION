import java.util.Scanner;

public class Array2DSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter rows ");
        int n = in.nextInt();
        System.out.println("enter colms ");
        int m = in.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println(" enter searc element ");
        int x = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == x)
                    System.out.println("index are : " + i + "," + j);
            }

        }
    }
}
