import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            StringBuilder sb =new StringBuilder();
            String text = br.readLine();
            sb.append(text.charAt(0)).append(text.charAt(text.length()-1));
            System.out.println(sb.toString());
        } 
    }
}