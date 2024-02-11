
//     1  
//    2 2 
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5 
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter row ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
