import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt(); 
        System.out.println(result(A,B));
    }
    public static String result (int a,int b) {
        
           if(a>b){
               return ">";
           }else if(a<b) {
               return "<";
           }else {
               return "==";
           }
    }
}