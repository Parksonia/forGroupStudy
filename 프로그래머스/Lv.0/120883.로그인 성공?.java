import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
   
        for(int i=0; i<db.length; i++) {
        
            if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])){
                answer ="login";
            } else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
                answer ="wrong pw";
            }
            }

        return answer;
    }
}
/*
        조건식을 이렇게 썼다면 더 심플했을텐데.. ㅎ 창피하다!
        for(int i = 0; i < db.length; i++){
            if(db[i][0].equals(id_pw[0])){
                if(db[i][1].equals(id_pw[1])){
                    return "login";
                }
                return "wrong pw";
            }
        }
        return "fail";
*/
