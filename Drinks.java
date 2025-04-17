import java.util.Scanner;
public class Drinks {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
      int arr[] = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ss.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / n;
        System.out.println(avg);

    }
}
