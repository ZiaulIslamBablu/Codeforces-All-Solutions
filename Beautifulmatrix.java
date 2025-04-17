import java.util.Scanner;

public class Beautifulmatrix {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);  
        int x = -1, y = -1; 
   
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int n = ss.nextInt();
                if (n == 1) {
                    x = i;  
                    y = j;  
                }
            }
        }

       
        System.out.println(Math.abs(x - 2) + Math.abs(y - 2));
    }
}
