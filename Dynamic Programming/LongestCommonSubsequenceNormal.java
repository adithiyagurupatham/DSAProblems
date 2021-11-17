/*
   Program to find the longest common subsequence
   Link : https://practice.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1/
   Time Complexity : O(2^min(m,n))
   Space Complexity : O(min(m,n))
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class LongestCommonSubsequenceNormal{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the first string");
    String s1 = br.readLine();
    System.out.println("Enter the second string");
    String s2 = br.readLine();
    System.out.println("The LCS is "+lcs(s1.length(),s2.length(),s1,s2));
  }

  static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        if(x==0 || y==0){
            return 0;
        }
        if(s1.charAt(x-1)==s2.charAt(y-1)){
            return 1+lcs(x-1,y-1,s1,s2);
        }
        else{
            return Math.max(lcs(x-1,y,s1,s2),lcs(x,y-1,s1,s2));
        }
    }

}
