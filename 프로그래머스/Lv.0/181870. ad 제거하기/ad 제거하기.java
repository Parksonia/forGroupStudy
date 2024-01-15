import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
      
        
        List<String> strArrList = new ArrayList<>();   
        
        for(int i= 0; i< strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                strArrList.add(strArr[i]); //remove 메서드는 List
            }
            /*
            else {
              continue;
            }
            */
        }
        
       return strArrList.toArray(new String[0]); 
        /* .toArray(리스트를 배열로)메서드는
        파라미터로 넘어온 배열의 크기를 확인하고 리스트 크기보다 작을 때, 
        List 크기를 기준으로 배열을 생성하게 된다. 
        만약 리스트의 크기보다 인자값이 클 경우 나머지 공간이 null로 채워지게됨! 
    */
    }
}
