import java.util.ArrayList;

public class FindSubset {
    public static void printsubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findsuset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printsubset(subset);
            return;
        }
        subset.add(n);
        findsuset(n - 1, subset);
        subset.remove(subset.size() - 1);
        findsuset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findsuset(n, subset);
    }
}
