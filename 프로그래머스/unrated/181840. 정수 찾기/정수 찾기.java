import java.util.*; //Arrays,ArrayList
class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();
        for(int i: num_list){
            arr.add(i);   //그냥 반복문 써서(==) 끝내도 됨..
        }
        
        if(arr.contains(n)) {answer=1;}
        return answer;
    }
}