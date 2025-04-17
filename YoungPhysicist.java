import java.util.Scanner;

public class  YoungPhysicist {
    
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt(); 
        
        int[][] arr = new int[a][3]; 

        int sum = 0, sum1 = 0, sum2 = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 3; j++) { 
                arr[i][j] = ss.nextInt();

                
                 sum += arr[i][0];
               sum1 += arr[i][1];
               sum2 += arr[i][2];
            }
        }

        if (sum == 0 && sum1 == 0 && sum2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
