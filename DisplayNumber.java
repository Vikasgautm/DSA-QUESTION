import java.util.Scanner;

public class DisplayNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("press 1 to continue and 0 to exit");
        int n = in.nextInt();
        int postive = 0, negative = 0, zeros = 0;
        while (n == 1) {
            System.out.println(" enter any number ");
            int number = in.nextInt();
            if (number > 0) {
                postive++;
            } else if (negative < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.println(" press 1 to continue and 0 to exit");
            n = in.nextInt();
        }
        System.out.println("Postives are : " + postive);
        System.out.println("Negatives are : " + negative);
        System.out.println("zeos are : " + zeros);
        in.close();
    }
}
