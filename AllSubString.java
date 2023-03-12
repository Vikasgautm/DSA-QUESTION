import java.util.*;

public class AllSubString {
    public static void printSubSeq(String sub,
            String ans) {

        if (sub.length() == 0) {
            System.out.print("" + ans + " ");
            return;
        }

        char ch = sub.charAt(0);

        String rem = sub.substring(1);

        printSubSeq(rem, ans);

        printSubSeq(rem, ans + ch);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String :");
        String str = in.nextLine();
        printSubSeq(str, "");

    }
}
