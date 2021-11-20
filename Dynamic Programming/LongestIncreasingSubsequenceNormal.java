/*
   Program to find the longest increasing subsequence
   Link : https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1/
   Time Complexity : O(N^2)
   Space Complexity : O(N)
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class LongestIncreasingSubsequenceNormal{

  static int longestSubsequence(int size, int a[])
    {
        int[] lis = new int[a.length];
        lis[0]=1;
        for(int i=1;i<a.length;i++){
            lis[i]=1;
            for(int j=0;j<i;j++){
                if(a[j]<a[i]){
                    lis[i]=Math.max(lis[i],lis[j]+1);
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int each : lis){
            ans = Math.max(ans,each);
        }
        return ans;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the  size");
    Integer n = Integer.valueOf(br.readLine());
    System.out.println("Enter the values");
    String input = br.readLine();
    String[] inputString = input.split(" ");
    int[] array = new int[n];
    for(int i=0;i<n;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The longest increasing subsequence is  "+longestSubsequence(n,array));
  }



}
