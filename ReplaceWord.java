import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter string ");
        String str = in.nextLine();
        String replace = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                replace += 'i';
            } else {
                replace += str.charAt(i);
            }
        }
        System.out.println(replace);
        in.close();
    }
}
