import java.util.*;

public class pteyandstring {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String s = ss.next().toLowerCase();
        String t = ss.next().toLowerCase();
      
        if (s.equals(t)) {
            System.out.println("0");
        } else {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) < t.charAt(j)) {
                    System.out.println("-1");
                    return;
                } else if (s.charAt(j) > t.charAt(j)) {
                    System.out.println("1");
                    return;
                }
            }
        }
    }
}
