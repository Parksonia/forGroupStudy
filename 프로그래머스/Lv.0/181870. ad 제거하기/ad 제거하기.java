import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
      
        
        List<String> strArrList = new ArrayList<>();   
        
        for(int i= 0; i< strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                strArrList.add(strArr[i]); //remove는 리스트..
            }
        }
        
       return strArrList.toArray(new String[0]);
    }
}