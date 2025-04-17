import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String s = ss.next();
        ss.close();
        int count = 0;

       
        for (int i =0; i<s.length(); i++){
           
            boolean isUnique = true;
            for (int j = 0; j<i; j++){
                if (s.charAt(i)==s.charAt(j)){
                    isUnique = false;
                    break;
                }  
            }
            if (isUnique) {
                count++;
            }
        }

        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
