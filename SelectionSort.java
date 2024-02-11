import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        in.close();
    }
}
