import java.util.Scanner;

public class CombindLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size ");
        int n = in.nextInt();
        String arr[] = new String[n];
        int totallength = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
            totallength += arr[i].length();
        }
        System.out.println(totallength);
        in.close();
    }
}
