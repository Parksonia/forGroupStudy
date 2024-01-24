import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i < b; i++) { // b줄
            for(int k=0; k<a; k++) {  // 별
                System.out.print("*");
            }
            System.out.println();
        }        
        

    }
}