import java .util.Scanner;
public class I_love_usename {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }
        int max = ratings[0];
        int min = ratings[0];
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > max) {
                max = ratings[i];
                count++;
            }
            if (ratings[i] < min) {
                min = ratings[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
