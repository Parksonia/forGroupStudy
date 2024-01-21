class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0) { // 짝수 , 하드 코딩^^...

            answer = Character.toString(s.charAt(s.length()/2-1))+Character.toString(s.charAt(s.length()/2)); ;
        
        }else {// 홀수
            answer = Character.toString(s.charAt(s.length()/2));
        }
        
        return answer;
    }
}