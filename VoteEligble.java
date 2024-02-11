import java.util.Scanner;

public class VoteEligble {
    public static boolean Checkeligble(int n) {
        if (n > 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your age");
        int n = in.nextInt();
        Checkeligble(n);
        if (Checkeligble(n)) {
            System.out.println(" your are eligble for voating  ");
        } else {
            System.out.println(" your are  not eligble for vote  ");
        }
    }
}
