public class PrintDigit {
    static void show(int n) {
        // if (n <= 0) {
        // return;
        // }
        // System.out.println(n);
        // show(n - 2);
        if (n == 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
        }
        show(n - 1);
        if (n % 2 == 0)
            System.out.println(n);

    }

    public static void main(String[] args) {
        show(5);
    }
}
