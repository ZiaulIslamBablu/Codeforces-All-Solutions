import java.util.*;
public class ultra_fast_mathematician {
    public static void main(String[] args) {
        String a, b;
        Scanner ss = new Scanner (System.in);
        a = ss.next();
        b = ss.next();
        for (int i =0; i<a.length();i++){
            if (a.charAt(i) == b.charAt(i)){
                System.out.print("0");
            }
            else{
                System.out.print("1");
            }
        }
        // for (int i =0; i<a.length(); i++){
        //     int xor= a.charAt(i)^b.charAt(i);
        //     System.out.print(xor);
        // }
    }
}
