import java.util.Scanner;
public class Dima_and_Friends {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt(); // Number of friends
        int totalfriendsfingers = 0;
        for (int i =0; i<n; i++){
            int a = ss.nextInt();
            totalfriendsfingers += a; // Sum of fingers of all friends
        }
        int safecoice = 0;
        for (int dima =1; dima<=5; dima++){
            int totalFingers = totalfriendsfingers + dima;
            int totalPeople = n + 1; 
            int position = totalFingers % totalPeople;

            if (position != 1) {
                safecoice++; // Count the safe choices for Dima
            }
        }
        System.out.println(safecoice); // Output the number of safe choices
        ss.close(); // Close the scanner to avoid resource leaks

    }
}
