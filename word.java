import java.util.Scanner;
public class word {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String s = ss.nextLine();
        int upper = 0, lower = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upper++;
            } else {
                lower++;
            }
        }
        if (upper > lower) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}
