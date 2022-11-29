
//check the armstrong number and store the list...
import java.util.*;

public class Armstrong {
    static ArrayList<Integer> getArmstrong(int num, int i) {
        if (i == num) {
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        ArrayList<Integer> list2 = getArmstrong(num, i + 1);
        if (isArmstrong(i, 0, i)) {
            list2.add(i);
        }
        return list2;
    }

    static boolean isArmstrong(int num, int sum, int temp) {
        if (num == 0) {
            if (sum == temp) {
                return true;
            }
            return false;
        }
        int rem = num % 10;
        sum += Math.pow(rem, 3);
        num /= 10;
        return isArmstrong(num, sum, temp);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number only numaric");
        int num = in.nextInt();
        ArrayList<Integer> list = getArmstrong(num, 1);
        System.out.println(list);
        in.close();
    }
}
