import java.util.Scanner;
// *****
// **** 
// ***
// **
// *

public class HalfPyramid2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter row");
        int n = in.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
