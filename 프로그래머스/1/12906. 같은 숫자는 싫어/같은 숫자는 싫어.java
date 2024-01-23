import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
  
        //중복 허용을 안하는 HashSet으로 문제풀이를 하려헀으나 연속적으로 반복되는것만 제거됨에 문제 발생
        //stack을 활용하여 문제 풀이
        
        Stack<Integer> stack = new Stack<>();        
        for(int i = 0; i< arr.length; i++) {
        //Stack이 비어있는 경우 peek()메서드가 EmptyStackException을 발생시킨다. 조건 충족시키기!!
            
          if(stack.isEmpty()||stack.peek()!=arr[i]) {  
           stack.push(arr[i]);    
          }
        }
      
         int[] answer = new int[stack.size()]; // stack.size()  : 스택의 크기 구하기 
        
        for(int i=stack.size()-1; i >= 0; i--) { // Stack은 LIFO임!! ,인덱스만큼 돌기  
            answer[i] = stack.pop(); //.pop() : 스택의 마지막 값 꺼내기 
        }
        
        return answer;
    }
}
