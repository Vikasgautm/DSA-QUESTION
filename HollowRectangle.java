import java.util.Scanner;
// * * * * * 
// *       * 
// *       * 
// * * * * * 

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter row");
        int n = in.nextInt();
        System.out.println("enter colum");
        int m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
