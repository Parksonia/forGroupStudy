class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int[][] answer = {};
        // 다중배열일때 아닐때 구분해야.. arr[0].length 가 2일때 1일때 
        System.out.println(arr1[0].length);
        
        int a = arr1.length;
        int b = arr1[0].length;
        
        answer = new int[a][b];
     
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++) {
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
       
      
        return answer;
    }
}