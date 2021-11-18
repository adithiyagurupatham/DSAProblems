/*
   Program to find the longest common subsequence
   Link : https://practice.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1/
   Time Complexity : O(m*n)
   Space Complexity : O(m*n)
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class LongestCommonSubsequenceOptimal{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the first string");
    String s1 = br.readLine();
    System.out.println("Enter the second string");
    String s2 = br.readLine();
    System.out.println("The LCS is "+lcs(s1.length(),s2.length(),s1,s2));
  }

  static int lcs(int x,int y,String s1, String s2,int[][] memo){
        if(x==0 || y==0){
            return 0;
        }
        if(memo[x][y]==-1){
            if(s1.charAt(x-1)==s2.charAt(y-1)){
                memo[x][y] =  1+lcs(x-1,y-1,s1,s2,memo);
            }
            else{
                memo[x][y] =  Math.max(lcs(x-1,y,s1,s2,memo),lcs(x,y-1,s1,s2,memo));
            }
        }
        return memo[x][y];

    }

    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int[][] memo = new int[x+1][y+1];
        for(int[] each : memo){
            Arrays.fill(each,-1);
        }
        return lcs(x,y,s1,s2,memo);
    }

}
