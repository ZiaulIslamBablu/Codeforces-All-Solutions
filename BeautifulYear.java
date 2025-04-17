import java.util.*;
public class BeautifulYear {
    public static void main(String[] args) {
        int n;
        Scanner ss = new Scanner (System.in);
        n = ss.nextInt();
        while(n!=0){
            n++;
            int a = n/1000;
            int b = n/100%10;
            int c = n/10%10;
            int d =  n%10;
            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                System.out.println(n);
                break;
            }
           
        }
        
    }
}
