public class MoveAllX {
    public static void movex(String str, int index, int count, String newString) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(index);
        if (curr == 'x') {
            count++;
            movex(str, index + 1, count, newString);
        } else {
            newString += curr;
            movex(str, index + 1, count, newString);
        }

    }

    public static void main(String[] args) {
        String str = "axcxxde";
        movex(str, 0, 0, "");
    }
}
