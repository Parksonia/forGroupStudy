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
        
        return answer; // 반복문 말고 그냥 리턴 타입을 stack으로 변경하는 방법도 있음 
    }
}

/* 처음에 시도 했던 방법에 index를 초과하는 문제가 있었음...
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);  // 처음부터 0번째 인덱스를 넣고 시작했다면 해결됨..

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1])
                list.add(arr[i]);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
}
*/
