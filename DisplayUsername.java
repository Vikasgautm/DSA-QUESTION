import java.util.Scanner;

public class DisplayUsername {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any email ");
        String email=in.next();
        String username="";
        for(int i=0;i<email.length();i++)
        {
            if(email.charAt(i)=='@')
            {
                break;
            }
            else{
                username +=email.charAt(i);
            }
        }
        System.out.println(username);
        in.close();
    }
}
