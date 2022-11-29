import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any string ");
        String s = in.nextLine();
        int i, j;
        char c[] = s.toCharArray();
        for (i = 0; i < s.length(); i++) {
            int count = 0;
            for (j = 0; j < s.length(); j++) {
                if (j < i && c[i] == c[j]) {
                    break;
                }
                if (c[i] == c[j]) {
                    count++;
                }
                if (j == s.length() - 1) {
                    System.out.println("your character frrequency " + c[i] + " is =" + count);
                }
            }
            in.close();
        }

    }
}
