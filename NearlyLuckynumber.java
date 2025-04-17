import java.util.*;
public class NearlyLuckynumber {
    public static void main(String[] args) {
        Scanner ss =  new Scanner(System.in);
        long n;
        n = ss.nextLong();
        int count = 0;
        while (n>0){
            if (n%10 == 4 || n%10 == 7){
                count++;
            }
            n = n/10;
        }
        if (count == 4 || count == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
