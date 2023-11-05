import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine())/4;
        String answer ="";
        
        for(int i=0; i<n; i++){
            answer+="long ";
        }   
        System.out.println(answer+"int");
    }
}