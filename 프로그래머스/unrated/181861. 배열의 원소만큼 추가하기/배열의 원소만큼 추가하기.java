class Solution {
    public int[] solution(int[] arr) {
        
        int size = 0;
        for(int i: arr) {
            size += i;
        }
        
        int[] answer = new int[size];
        int count = 0;
        int index = 0;
        for(int i=0; i<answer.length; i++) {
                answer[i] = arr[index];
                count++;
                if(count == arr[index]) {
                    count=0;
                    index++;
                    continue;
                }
        }
        return answer;
    }
}