
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
            if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    return false;  
                }
            }
            return true;  
        } else {
            return false; 
        }

    }
}
/*
일부 테스트 케이스만 통과됨(오답)

            for(int i =0; i< s.length(); i++) {
            
            if(Character.isDigit(s.charAt(i))) {
                
            }else {
                answer = false;
            }
        }
        
        return answer;
*/