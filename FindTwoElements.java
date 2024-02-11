public class FindTwoElements {
    public static int findelement(int[] arr){
        int j=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[j]){
                return arr[j];
            }
            j++;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={2,3,3,4,5};
        System.out.println(findelement(arr));
    }
}
