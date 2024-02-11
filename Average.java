import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any three number ... ");
        float n = in.nextFloat();
        float a = in.nextFloat();
        float b = in.nextFloat();
        float Average = (n + a + b) / 3;
        System.out.println(Average);
        in.close();
    }
}
