/**
Program to find the lexicographic rank of a string
Link : https://practice.geeksforgeeks.org/problems/rank-the-permutations-1587115621/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class LexicographicRank{

  static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans *=i;
        }
        return ans;
    }

    static int findRank(String s)
    {
        int ans=1,n=s.length();
        int[] count = new int[256];
        int mul = fact(n);
        // System.out.println("mul is "+mul);
        for(int i=0;i<n;i++)
        {
            count[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if(count[i]>1)
            {
                return 0;
            }
        }
        for(int i=1;i<256;i++)
        {
            count[i]+=count[i-1];
        }
        for(int i=0;i<n-1;i++)
        {
            mul = mul/(n-i);
            ans= (ans + count[s.charAt(i)-1]*mul);
            for(int j=s.charAt(i);j<256;j++)
                count[j]--;
        }
        return ans;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  string");
      String str = br.readLine();
      System.out.println("The lexicographic rank of string is  "+ findRank(str));
  }

}
