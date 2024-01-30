import java.util.*;
class Solution
{
    public int solution(String s)
    {
        
    //Stack사용하여 런타임에러 해결하기
        int answer = 1;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); 
            } else {
                stack.push(c); 
            }
        }

      
        if (!stack.isEmpty()) {
            answer = 0;
        }

        return answer;
    }
}
    /* 런타임 에러 탈락     
      int answer = 1;
        // StringBuffer의 delete 사용하기 
        StringBuffer sb = new StringBuffer(s);
        int start = 0;
        int end = 0;

        while (sb.length() != 0) {

            for (int i = 0; i < sb.length() - 1; i++) {

                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    start = i;
                    end = i + 2;
                    sb.delete(start, end);
                    System.out.println(sb.toString());
                    continue;
                }
                }
            }

        if (sb.length() != 0) {
            answer = 0;
        
        }

        return answer;
    }
*/