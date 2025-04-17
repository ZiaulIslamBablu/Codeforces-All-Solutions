import java.util.Scanner;

public class Arrivalofthegeneral {
    public static void main (String [] args){
        Scanner ss = new Scanner (System.in);
        int n =ss.nextInt();
        int [] arr = new int [n];
        for (int i =0; i<arr.length; i++){
            arr[i] = ss.nextInt();
        }
        int max = arr[0];
        int min = 101;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i =0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i]<=min){
                min = arr[i];
                minIndex = i;
            }
        }
        int count = 0;
        if (maxIndex>minIndex){
            count = maxIndex + (n-1-minIndex)-1;
        }
        else {
            count = maxIndex + (n-1-minIndex);
        }   
        System.out.println(count);
    }
}
