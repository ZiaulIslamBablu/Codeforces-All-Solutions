import java.util.Scanner;
public class bitplus {
    public static void main (String [] args){
        
        Scanner ss = new Scanner (System.in);
        int a = ss.nextInt();
        int x = 0;
        String s;
        for (int i =0; i<a;i++){
            s = ss.next();
            if (s.equals("++X") || s.equals("X++")){
                x++;
            }
            else if (s.equals("--X") || s.equals("X--")){
                x--;
            }
        }
        System.out.println(x);

    }
}
