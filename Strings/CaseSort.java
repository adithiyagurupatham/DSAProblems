/**
Program to sort the strig based on the case
Link : https://practice.geeksforgeeks.org/problems/case-specific-sorting-of-strings4845/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class CaseSort{

  static String sort(StringBuilder sb)
    {
        int[] count = new int[256];
        for(int i=0;i<sb.length();i++)
        {
            count[sb.charAt(i)]++;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<256;i++)
        {
            int val = count[i];
            char c = (char) i;
            for(int j=0;j<val;j++)
            {
                ans.append(c);
            }
        }
        return ans.toString();
    }

    public static String caseSort(String str)
    {
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                lower.append(str.charAt(i));
            }
            else
            {
                upper.append(str.charAt(i));
            }
        }
        String lowerString = sort(lower);
        String upperString = sort(upper);
        StringBuilder ans = new StringBuilder();
        int j=0,k=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                ans.append(lowerString.charAt(j++));
            }
            else
            {
                ans.append(upperString.charAt(k++));
            }
        }
        return ans.toString();

    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  string");
      String str = br.readLine();
      System.out.println("The sorted string is  "+ caseSort(str));
  }

}
