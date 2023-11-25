import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[2];

       String input = br.readLine();
       arr= input.split(" ");
       

        StringBuilder sb1 = new StringBuilder(arr[0]);
        StringBuilder sb2 = new StringBuilder(arr[1]);

        arr[0] = sb1.reverse().toString();
        arr[1] = sb2.reverse().toString();

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}