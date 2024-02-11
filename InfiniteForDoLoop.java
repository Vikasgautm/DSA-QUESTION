import java.util.Scanner;

public class InfiniteForDoLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(" enter data");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (n > 0);
        in.close();
    }
}
