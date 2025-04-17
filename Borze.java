import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String s = ss.next();
        String ans = "";
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                ans += "0";
                i++;
            } else if (i + 1 < s.length() && s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                ans += "1";
                i += 2; 
            } else if (i + 1 < s.length() && s.charAt(i) == '-' && s.charAt(i + 1) == '-') {
                ans += "2";
                i += 2; 
            }
        }

        System.out.println(ans);
  
    }
}
