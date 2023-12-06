class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<n; i++) {
            if(i*i == n) {
                answer = 1;
                break;
            }else{
                answer = 2;
         
            }
        }
        
        return answer;
    }
}
/*
다른 사람 풀이
class Solution {
    public int solution(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
*/