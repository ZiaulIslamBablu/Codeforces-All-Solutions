import java.util.Scanner;
import java.util.Arrays;

public class helpfulmath {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String s = ss.next();
        ss.close(); 

       
        char[] arr = s.replace("+", "").toCharArray();

        // Sort the array
        Arrays.sort(arr);

        // Build the output string with '+' signs
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sortedString.append(arr[i]);
            if (i < arr.length - 1) {
                sortedString.append("+");
            }
        }
        // Print the sorted string
        System.out.println(sortedString.toString());
    }
}
