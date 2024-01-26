class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long total = 0;
        for(int i=1; i<=count; i++) {
            total += (i*price);            
        }
        if(total<=money){answer=0;}
        
        else if(total>money){
            answer = total-money;
        }
        return answer;
    }
}