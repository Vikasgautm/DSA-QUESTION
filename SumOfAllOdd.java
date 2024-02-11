import java.util.Scanner;

public class SumOfAllOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        in.close();
    }
}
