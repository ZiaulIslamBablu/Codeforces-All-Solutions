import java.util.*;
public class Amusingjoke {
    public static void main (String [] args){
        Scanner ss = new Scanner (System.in);   
        String s1 = ss.next();
        String s2 = ss.next();
        String s3 = ss.next();
        String s = s1+s2;
        char [] c = s.toCharArray();
        char [] d = s3.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if (Arrays.equals(c,d)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
