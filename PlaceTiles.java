public class PlaceTiles {
    public static int place(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verticleplace=place(n-m,m);
        int horigentel=place(n-1,m);
        return verticleplace+horigentel;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(place(4, 2));
    }
}
