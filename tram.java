import java.util.Scanner;
public class tram{
    public static void main(String[] args) {
        Scanner ss = new Scanner (System.in);
        int n = ss.nextInt();
        int a[] = new int [n];
        for (int i=0; i<n; i++){
            int x = ss.nextInt();
            int y = ss.nextInt();
            a[i] = y-x;
        }

        int max = a[0];
        for (int i=1; i<n; i++){
            a[i] = a[i] + a[i-1];
            if (a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}