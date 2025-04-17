import java.util.*;
public class softdrinking {
    public static void main (String[] agrs){
        Scanner ss = new Scanner (System.in);
        int n = ss.nextInt();
        int k = ss.nextInt();
        int l = ss.nextInt();
        int c = ss.nextInt();
        int d = ss.nextInt();
        int p = ss.nextInt();
        int nl = ss.nextInt();
        int np = ss.nextInt();
        int total = k*l/nl;
        int total1 = c*d;
        int total2 = p/np;
        int min = Math.min(total, total1);
        int min1 = Math.min(min, total2);
        System.out.println(min1/n);
    }
}
