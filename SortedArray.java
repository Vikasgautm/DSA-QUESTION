import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        boolean isAssending = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                isAssending = false;
        }
        if (isAssending) {
            System.out.println(" your arry is sorted ");
        } else {
            System.out.println(" yout array is not sorted ");
        }
        in.close();
    }
}
