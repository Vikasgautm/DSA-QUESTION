import java.util.Scanner;

public class Adjacentstars {
    static String y = "";

    static void Adjacent(String str, int i) {
        y = y + str.charAt(i);
        if (i == str.length() - 1) {
            return;
        }
        if (str.charAt(i) == (str.charAt(i + 1))) {
            y = y + "*";
        }
        Adjacent(str, i + 1);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any string..");
        String str = in.next();
        Adjacent(str, 0);
        System.out.println(y);
        in.close();
    }
}
