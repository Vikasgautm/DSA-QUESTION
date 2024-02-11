public class KeypadCom {
    public static String keypad[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printcom(String str, int index, String com) {
        if (index == str.length()) {
            System.out.println(com);
            return;
        }
        char curr = str.charAt(index);
        String mapping = keypad[curr - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printcom(str, index + 1, com + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printcom(str, 0, "");
    }
}
