import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int [] answer;
        ArrayList<Integer> list = new ArrayList<>(); // 크기 문제를 해결못하겠어서 리스트 사용
        //Arrays.sort(arr); 정렬하는 문제가 아녔음 , 그냥 최소값만 제거하면 됨..
        
        int min = Integer.MAX_VALUE; // 최소값을 구하기 위함.
        for(int i =0; i< arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for(int i =0; i<arr.length; i++){
            
            if(arr[i]!=min){
            list.add(arr[i]);
            }
            System.out.println(list.size());
        }
             
            if(list.size()==0){
                answer = new int[list.size()+1];
                answer[0]=-1;
                 //answer = new int[]{-1};
            }else{
                answer = new int[list.size()]; 
                for(int i=0; i<list.size(); i++){
         
                 answer[i] = list.get(i);  
            }
    
            }
     
    
        return answer;
    }
}