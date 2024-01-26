import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        //주의 공백을 고려해야함
        
        int temp =0;
        for(int i=0; i<s.length(); i++){
            System.out.println((int)s.charAt(i));
            //3가지 조건! 대문자,소문자,공백일 때 하드코딩밖에 생각이 안남.. 리팩토링하기...
            
            if(Character.isUpperCase(s.charAt(i))) {
             temp = (int)s.charAt(i);
             temp+=n;
                if(temp>90){
                    temp-=26;
                }
             answer+=(char)temp;
            }else if(Character.isLowerCase(s.charAt(i))) {
             temp = (int)s.charAt(i);
             temp+=n;
                if(temp>122){
                    temp-=26;
                }
             answer+=(char)temp;
            }else if(s.charAt(i)==' '){  //== 사용할 때 문자는 ' '작은따옴표로 공백표시 
   
                answer+=" ";
            }

        }
   
        return answer;
    }
}