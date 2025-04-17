import java.util.*;

public class Lightsout {

    public static int light(int n) {
        return (n == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[][] initial = new int[3][3];
        Scanner ss = new Scanner(System.in);
        int[][] a = new int[3][3];

        // Step 1: Read input and convert odd numbers to 1, even to 0
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = ss.nextInt();
                a[i][j] = (a[i][j] % 2 == 1) ? 1 : 0;  // Convert odd counts to 1, even to 0
                initial[i][j] = 1;  // All lights start ON
            }
        }
        ss.close();  // Close Scanner after input is taken

        // Step 2: Process the grid and toggle lights
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 1) {  // If this light was pressed an odd number of times
                    initial[i][j] = light(initial[i][j]); // Toggle current light
                    if (i - 1 >= 0) initial[i - 1][j] = light(initial[i - 1][j]); // Toggle top cell
                    if (i + 1 < 3) initial[i + 1][j] = light(initial[i + 1][j]); // Toggle bottom cell
                    if (j - 1 >= 0) initial[i][j - 1] = light(initial[i][j - 1]); // Toggle left cell
                    if (j + 1 < 3) initial[i][j + 1] = light(initial[i][j + 1]); // Toggle right cell
                }
            }
        }

        // Step 3: Print the final grid
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(initial[i][j]); // Print each light without space
            }
            System.out.println(); // Move to the next line
        }
    }
}
