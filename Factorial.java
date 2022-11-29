import java.util.*;

class Recurrsion {
    int fact(int n) {
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));
    }
}

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any numeric value");
        int x = in.nextInt();
        Recurrsion ob = new Recurrsion();
        int y;
        y = ob.fact(x);
        System.out.println("your factorial is =" + y);
        in.close();
    }
}
