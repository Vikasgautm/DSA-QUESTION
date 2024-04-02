public class BinarySearch {
    public static boolean search(int arr[],int start,int end,int val){
        if(start<=end){
            int mid=start+(end-start)/2;
            
        if(arr[mid]==val){
            return true;
        }else if(arr[mid]>val){
            return search(arr, start,mid-1, val);
        }else
           return search(arr, mid+1, end, val);
        
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,7,8,9,10};
          int start=0,end=arr.length-1;
          if(search(arr,start,end,1)){
            System.out.println("element found");
          }else{
            System.out.println("elemnet not found ");
          }
    }
}
