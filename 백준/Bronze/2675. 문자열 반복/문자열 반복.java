import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 숫자 입력
        
        for(int i=0; i<num; i++) {
            String[] arr =br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            String text = arr[1];
            StringBuilder sb = new StringBuilder();
         
            for(int j=0; j<text.length(); j++){
                for(int k=0; k<n; k++){
                      sb.append(text.charAt(j));
                }
            }  
              System.out.println(sb);
        }    
    }
}