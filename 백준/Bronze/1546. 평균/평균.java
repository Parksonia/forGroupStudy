import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of subjects
        int n = sc.nextInt();

        // Input: Sejun's current grades
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextInt();
        }

        // Find the maximum grade
        int maxGrade = Arrays.stream(grades).max().orElse(0);

        // Calculate the new scores and sum
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += grades[i] * 100.0 / maxGrade;
        }

        // Calculate the new average
        double newAverage = sum / n;

        // Output the new average
        System.out.printf("%.2f%n", newAverage);
    }
}