import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String input = sc.nextLine();
            list.add(input);
        }

        StringBuilder sb = new StringBuilder();
        int maxLength = 0;
        for (String word : list) {
            maxLength = Math.max(maxLength, word.length());
        }

        for (int i = 0; i < maxLength; i++) {
            for (String word : list) {
                if (i < word.length() && word.charAt(i) != ' ') {
                    sb.append(word.charAt(i));
                }
            }
        }

         System.out.println(sb.toString());
    }
}
