import java.util.Scanner;

public class QueueAtThechool {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        
        
        int a = ss.nextInt(); 
        int b = ss.nextInt(); 
        String s = ss.next();
      

        char[] c = s.toCharArray();

      
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a - 1; j++) {
                if (c[j] == 'B' && c[j + 1] == 'G') {
                   
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                    j++; 
                }
            }
        }

    
        System.out.println(new String(c));
    }
}
