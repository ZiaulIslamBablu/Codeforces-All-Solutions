import java.util.Scanner;
public class StonesontheTable {
 public static void main(String[] args) {
    int n;
    String s;
    Scanner ss = new Scanner (System.in);   
    n = ss.nextInt();
    s = ss.next();
    int count = 0;
    for (int i = 0; i < n-1; i++) {
        if (s.charAt(i) == s.charAt(i+1)) {
            count++;
        }
    }
    System.out.println(count);
 }   
}
