import java.util.HashSet;

public class RemoveDuplicate {
    public static void sequence(String str, int index, String newstring) {
        HashSet<String> set = new HashSet<>();
        if (index == str.length()) {
            if (set.contains(newstring)) {
                return;
            } else {
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        char curr = str.charAt(index);
        sequence(str, index + 1, newstring + curr);
        sequence(str, index + 1, newstring);
    }

    public static void main(String[] args) {
        String str = "aaa";
        sequence(str, 0, "");
    }
}
