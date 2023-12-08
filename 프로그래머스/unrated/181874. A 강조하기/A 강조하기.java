class Solution {
    public String solution(String myString) {
        String answer = "";
        answer = myString.toLowerCase();
        if(answer.contains("a")){
           answer = answer.replaceAll("a","A");
        }
        
        return answer;
    }
}
/*
따로 조건문 사용할 필요 없이 순서대로만(소문자변경,replaceAll) 나열해줘도 되고 
이렇게    return myString.toLowerCase().replaceAll("a", "A"); 해도 됨.

*/