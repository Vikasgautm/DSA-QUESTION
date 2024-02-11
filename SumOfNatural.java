import java.util.Scanner;

public class SumOfNatural {
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;

        }
        sum += i;// this statment are sum when stack are up
        printSum(i + 1, n, sum);
        System.out.println(i);// when stack are down
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number ");
        int n = in.nextInt();
        printSum(1, n, 0);
        in.close();
    }
}
