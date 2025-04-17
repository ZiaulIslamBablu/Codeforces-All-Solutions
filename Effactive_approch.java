import java.util.*; 
public class Effactive_approch {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

      
        int[] position = new int[n + 1];  
        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            position[value] = i; 
        }

       
        int m = sc.nextInt();

        long vasya = 0;  
        long petya = 0;  

        for (int i = 0; i < m; i++) {
            int query = sc.nextInt();
            int pos = position[query];

            vasya += pos;           // Vasya checks from left to right
            petya += n - pos + 1;   // Petya checks from right to left
        }

        
        System.out.println(vasya + " " + petya);
    }
}