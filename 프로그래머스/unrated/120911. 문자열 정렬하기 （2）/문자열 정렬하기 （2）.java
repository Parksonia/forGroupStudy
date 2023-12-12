import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char [] transfer = my_string.toCharArray();
        Arrays.sort(transfer);
        answer = String.valueOf(transfer);  //char[] 를 바로 String 으로 형변환
        
        
        return answer;  // retrun new String(transfer); 로 해도 됨
    }
}