
// chech the array is sorrted or not 
import java.util.Scanner;

public class CheckSortedArray {
    public static boolean is_sorted(int a[]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ente size of array...");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" enter data..");
            a[i] = in.nextInt();
        }
        boolean y = is_sorted(a);
        if (y) {
            System.out.println(" yes your arrray is sorted...");
        } else {
            System.out.println(" your array is not sorrted... ");
        }
        in.close();
    }
}
