import java.util.Scanner;
public class wordCapitalization {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String s = ss.next();
        for (int i =0 ; i<s.length(); i++){
            if (!Character.isUpperCase(s.charAt(i)) && i==0){
                System.out.print(Character.toUpperCase(s.charAt(i)));
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
}
