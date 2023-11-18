import java.util.*;

public class Main {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];
        String numbers = sc.next(); 
        arr=numbers.split("");
        
        int sum = 0;
        for(String i:arr){
            sum+=Integer.parseInt(i);
        }
        System.out.println(sum);
    }
}