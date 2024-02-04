import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int [2];
        
        
        //테두리는 한줄만 갈색이어야함 !!!! 주의!! 테두리(갈색)를 뺀 내부영역의 크기 => (a-2)(b-2)
        
        int size = brown+yellow;
        int a = 0;
        int b = 0;

        for(int i=1; i<= size; i++) {
             if(size%i == 0 ){
             a = i;
             b = size/i;           
             }
     
            if((a-2)*(b-2)==yellow){ 
                answer[0] = a;
                answer[1] = b;    
            }
    
        }
    
        return answer;
    }
}
