public class CountTotalPath {
    public static int countpath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 || j == m - 1) {
            return 1;
        }
        int downtcount = countpath(i + 1, j, n, m);
        int rightcount = countpath(i, j + 1, n, m);
        return downtcount + rightcount;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalcount = countpath(0, 0, n, m);
        System.out.println(totalcount);
    }
}
