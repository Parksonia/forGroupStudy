import java.util.*;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] result = new int[n][m]; 
        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++) {  //arr[n].length;
                arr1[i][j]=sc.nextInt();
               
            }
        }
            for(int i=0; i<n; i++){
            for(int j=0;j<m; j++) {  //arr[n].length;
                arr2[i][j]=sc.nextInt();
               
            }
        }
         for(int i=0; i<n; i++){
            for(int j=0;j<m; j++) { 
            result[i][j] =arr1[i][j]+arr2[i][j];
            System.out.print(result[i][j]+" ");
            }
          System.out.println();
        }
        
    }
    
}