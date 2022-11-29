
//palindrome string 
import java.util.*;

public class PalindromeString {
    public static void Palindrome(String s) {
        String rev = "", l = s;
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (l.equals(rev)) {
            System.out.println(" your string is palindrome = " + l);
        } else
            System.out.println("your string is not palindrome = " + l);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter any string ");
        String s = in.nextLine();
        Palindrome(s);
        in.close();
    }
}
