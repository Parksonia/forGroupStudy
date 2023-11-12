/*
스스로 해결 못함
1.boolean type 으로 해결할 생각 못함
2. 간단한 방법으로 hashset 으로 .remove() .contains() 를 활용한 방법도 있음 
*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] submitted = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            submitted[num - 1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!submitted[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
