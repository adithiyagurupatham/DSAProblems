/**
Program to check if the pattern is present in the string or not using KMP algorithm
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class KMPAlgorithm{

  static void computeLPSArray(String pat, int M, int lps[])
    {
	    int i=1,len=0;
	    while(i<M){
	        if(pat.charAt(i) == pat.charAt(len))
	        {
	            len++;
	            lps[i] = len;
	            i++;
	        }
	        else if(len==0){
	            lps[i] = 0;
	            i++;
	        }
	        else{
	            len = lps[len-1];
	        }
	    }

    }

  static boolean KMPSearch(String pat, String txt)
    {
        int[] lps = new int[pat.length()];
        computeLPSArray(pat,pat.length(),lps);
        int n=txt.length(),m = pat.length(),i=0,j=0;
        while(i<n)
        {
           if(pat.charAt(j) == txt.charAt(i))
           {
               i++;
               j++;
           }
           if(j==m){
               return true;
           }
           else if(i<n && pat.charAt(j) != txt.charAt(i))
           {
               if(j==0){
                   i++;
               }
               else
               {
                   j = lps[j-1];
               }
           }
        }
        return false;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the text");
      String str = br.readLine();
      System.out.println("Enter the pattern");
      String pat = br.readLine();
      System.out.println("The pattern existence in string is "+KMPSearch(pat, str));
  }

}
