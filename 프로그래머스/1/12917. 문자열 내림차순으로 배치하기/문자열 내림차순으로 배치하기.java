import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char [] charArr= s.toCharArray();
        Arrays.sort(charArr);
    
        StringBuilder sb = new StringBuilder(new String(charArr));
        
        answer = new String(sb.reverse());  // 대문자는 또 따로 생각해야함..
        
        return answer;
    }
}