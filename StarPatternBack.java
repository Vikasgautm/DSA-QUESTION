
//*****
//**** 
//*** 
//** 
//* 
import java.util.*;

public class StarPatternBack {

    public static void row(int i, int n) {
        if (i <= n) {

            col(1, i, n);
            System.out.println();
            row(i + 1, n);
        }
    }

    public static void col(int j, int i, int n) {
        if (j <= n - i + 1) {
            System.out.print("*");
            col(j + 1, i, n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size ");
        int n = in.nextInt();
        row(1, n);

        in.close();
    }
}
