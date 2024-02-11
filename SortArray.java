public class SortArray {
    public static boolean checksort(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return checksort(arr, index + 1);
        } else
            return false;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // checksort(arr,0);
        if (checksort(arr, 0)) {
            System.out.println("array is sorted ");
        } else {
            System.out.println("not sorted ");
        }
    }
}
