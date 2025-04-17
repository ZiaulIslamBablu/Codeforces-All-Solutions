import java.util.Scanner;

public class PanoramixPrediction {
    public static boolean isPrime(int n) {
        if (n < 2) return false; // 1 is not prime
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int m = ss.nextInt();
        ss.close();

        int nextPrime = n + 1;
        while (!isPrime(nextPrime)) {
            nextPrime++;
        }

        if (nextPrime == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
