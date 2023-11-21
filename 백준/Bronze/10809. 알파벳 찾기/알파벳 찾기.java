import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] text = br.readLine().toCharArray(); //split이 아니라 .toCharArray()
        //char[]alphabet = new char[26]; // 알파벳 담기 
        int[] alphabet = new int[26]; // 아스키코드 담기  
        //char a ='a';
        //int numA =(int)a;  //'a'의 아스키코드 숫자를 알 수 있음 
        for(int i=0; i<26; i++){
           // alphabet[i] =(char)(numA+i);  //== (char)('a'+i) 배열에 a~z담기 // 아스키 코드로 접근해볼까..?
           //alphabet[i] = (int)('a'+i); //a~z 아스키코드 숫자 저장
           alphabet[i] =-1; // -1 로배열 초기화

        }
          
             for(int j=0; j<text.length; j++){
                 int index = (int)text[j] -(int)'a'; 
                 if(alphabet[index]==-1){
                     alphabet[index] = j; 
                     
                 }
             
         }
        for(int i :alphabet){
           System.out.print(i+" ");
        }
    }
}