import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String input = br.readLine();
        int num = Integer.parseInt(br.readLine())-1;
        
        System.out.println(input.charAt(num));
        
    }
}