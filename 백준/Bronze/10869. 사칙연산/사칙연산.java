import java.util.*;

   public class Main {
        public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
           result(A,B); 
        }

    public static void result(int a,int b) {
            int r1 = a + b;
            int r2 = a - b;
            int r3 = a * b;
            int r4 = a / b;
            int r5 = a % b;
                
            System.out.println(r1+"\n"+r2+"\n"+r3+"\n"+r4+"\n"+r5);
          
        }  
    }
