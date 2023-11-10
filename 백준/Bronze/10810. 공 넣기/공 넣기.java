import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];  //배열값 0으로 초기화됨..?
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
             
            for(int j=a-1; j<b; j++){
                 arr[j] = c;
             }
                 }
             for(int i=0; i<n; i++) {
                     System.out.println(arr[i]);
                 }
             }    
    
    }
    
