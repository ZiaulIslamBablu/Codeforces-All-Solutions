import java.util.*;
public class perfectpermutation {
    public static void main(String[] args) {
    Scanner ss =new Scanner (System.in);
    int n;
    n = ss.nextInt();
    for (int i = 1; i<=n; i++){
        if (n%2 != 0){
            System.out.println("-1");
            break;
        }
        else if (i%2 == 0){
            System.out.print(i-1 + " ");
        }
        else{
            System.out.print(i+1 + " ");
        }
    }
    }}
