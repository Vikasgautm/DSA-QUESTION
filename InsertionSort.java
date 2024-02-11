import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        in.close();
    }
}
