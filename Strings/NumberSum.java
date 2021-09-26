/**
Program to find the number sum of the string value
Link : https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class NumberSum{

  static long getVal(String s,int i)
    {
        long ans=0;
        while(i<s.length() && (s.charAt(i)>=48 && s.charAt(i)<=57))
        {
            ans = (ans*10) + (s.charAt(i)-48);
            i++;
        }
        return ans;
    }

    static long findSum(String str)
    {
        long sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=48 && str.charAt(i)<=57)
            {
                sum+=getVal(str,i);
            }
            while(i<str.length() && (str.charAt(i)>=48 && str.charAt(i)<=57))
            {
                i++;
            }
        }
        return sum;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  string");
      String str = br.readLine();
      System.out.println("The number sum of the string is  "+ findSum(str));
  }

}
