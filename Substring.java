public class Substring {
    public static void Sequence(String str, int index, String newsString) {
        if (index == str.length()) {
            System.out.println(newsString);
            return;
        }
        char curr = str.charAt(index);
        Sequence(str, index + 1, newsString + curr);
        Sequence(str, index + 1, newsString);
    }

    public static void main(String[] args) {
        String str = "abc";
        Sequence(str, 0, "");
    }
}
