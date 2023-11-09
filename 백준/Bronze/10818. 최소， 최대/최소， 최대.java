import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]num =new int[n];
        for(int i=0; i<n; i++){
            num[i] =sc.nextInt();
        }
        Arrays.sort(num);
        sc.close();
        System.out.print(num[0]+" "+num[n-1]);
    } 
    
}