import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException  {
    
    	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	        
    	       String input = br.readLine().trim();
                 if(input.equals("")) {
                    System.out.print(0);
                     return;
                }      
        
               String []arr = input.split(" ");
    	        System.out.print(arr.length);
               
    	    }
    	
    }
