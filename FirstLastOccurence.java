public class FirstLastOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void FindOccurence(String str, int index, char element) {
        if (str.length() == index) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(index);
        if (curr == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        FindOccurence(str, index + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaafaah";
        FindOccurence(str, 0, 'a');

    }
}
