import java.util.Scanner;

public class TransporseMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter rows ");
        int n = in.nextInt();
        System.out.println("enter colums ");
        int m = in.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("your transporse matrix ");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
