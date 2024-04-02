package Tree;

public class LinearSearch {
    public static boolean search(int arr[],int val){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==val){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,7,8,9,10};
        int s=1; //f=0
        if(search(arr,s)){
            System.out.println("element found");
        }else{
            System.out.println("elemnet not found");
        }
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]==s){
        //         f++;
        //         System.out.println("element  found "+arr[i]+"index are "+i);
        //     }
        // }
        // if(f==0){
        //     System.out.println("not found element");
        // }
    }
}
