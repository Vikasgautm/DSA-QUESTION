
//reverse string simple using metgod
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any string");
        String s = in.nextLine();
        StringBuffer n = new StringBuffer(s);
        n.reverse();
        System.out.println(n);
        in.close();
    }
}
