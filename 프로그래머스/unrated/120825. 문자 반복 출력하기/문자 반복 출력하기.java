import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
         answer = sb.toString();
        return answer;
    }
}


/*

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);  //String 의 메서드로 .repeat(int)반복 메서드를 활용하는 방법도 있음 파라미터로 주어진 횟수만큼 반복함
        }
        return answer;
    }
}



*/
