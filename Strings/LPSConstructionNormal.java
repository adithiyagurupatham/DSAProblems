/**
Program to construct the LPS array of the given String
Time Complexity : O(N^3)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class LPSConstructionNormal{

  static int constructLPS(String str,int n)
    {
      for(int len = n-1;len>0;len--){
        boolean flag = true;
        for(int i=0;i<len;i++){
          if(str.charAt(i) != str.charAt(n-len+i)){
            flag = false;
            break;
          }
        }
        if(flag){
          return len;
        }
      }
      return 0;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the text");
      String str = br.readLine();
      int[] lps = new int[str.length()];
      for(int i=0;i<str.length();i++)
      {
        lps[i] = constructLPS(str, i+1);
      }
      System.out.println("The LPS array is  "+Arrays.toString(lps));
  }

}
