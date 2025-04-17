import java.util.Scanner;
public class Cupboards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int d1=0,d2=0,d3=0,d4=0;
        for(int i=0;i<n;i++){
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            if(a==0){
                d1++;
            }
            else{
                d2++;
            }
            if(b==0){
                d3++;
            }
            else{
                d4++;
            }
        }
        int ans = Math.min(d1,d2)+Math.min(d3,d4);
        System.out.println(ans);
        
    }
}
