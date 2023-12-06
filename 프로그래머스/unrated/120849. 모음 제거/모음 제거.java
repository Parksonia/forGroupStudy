import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String [] arr = {"a","e","i","o","u"};
        
       
        for (int i = 0; i < arr.length; i++) {
            if (my_string.contains(arr[i])) {
                my_string = my_string.replace(arr[i], "");
            }
        }

        return my_string;
    }
}
/*
 replace 여러개 조건식을 | 또는 으로 바로 가능!!
   return myString.replaceAll("a|e|i|o|u", "");

*/