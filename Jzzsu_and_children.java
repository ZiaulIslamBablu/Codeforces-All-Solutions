import java.util.Scanner;
public class Jzzsu_and_children {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt(); 
        int m = ss.nextInt(); 
        int[] a = new int[n]; 
        for (int i = 0; i < n; i++) {
            a[i] = ss.nextInt();
        }
        int lastChild= 0;
        for (int i =0; i<n;i++){
            int t = (a[i]+m-1)/m;
            if (t >= (a[lastChild] + m - 1) / m) {
                lastChild = i;
            }
        }

        System.out.println(lastChild + 1); 
        }
    }

