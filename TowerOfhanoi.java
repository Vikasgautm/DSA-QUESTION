import java.util.Scanner;

public class TowerOfhanoi {
    public static void tower(int n, String s, String h, String d) {
        if (n == 1) {
            System.out.println("traverse the disk " + n + " from " + s + " to " + d);
            return;
        }
        tower(n - 1, s, d, h);
        System.out.println("traverse to disk " + n + " from " + s + " to " + d);
        tower(n - 1, h, s, d);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of disk ");
        int n = in.nextInt();
        tower(n, "s", "h", "d");
        in.close();
    }
}
