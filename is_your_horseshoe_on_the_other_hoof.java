import java.util.Scanner;
import java.util.Arrays;

public class is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int a[] = new int[4]; // Array to store input colors
        
        for (int i = 0; i < 4; i++) {
            a[i] = ss.nextInt();
        }
        ss.close(); 

        Arrays.sort(a); 
        int count = 1; 
        for (int i = 1; i < 4; i++) { // Start from index 1 and compare with previous value
            if (a[i] != a[i - 1]) { // If current color is different from previous, it's unique
                count++;
            }
        }

        System.out.println(4 - count); // Minimum horseshoes Valera needs to buy
    }
}
