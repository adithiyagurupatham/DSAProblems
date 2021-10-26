/**
Program to convert the string to zig-zag manner
Link : https://practice.geeksforgeeks.org/problems/concatenation-of-zig-zag-string-in-n-rows0308/1
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class ZigZagConversion{

  static String convert(String s, int n)
    {
        int len = s.length(),i=0;
        StringBuilder sb = new StringBuilder();
        StringBuilder[] sba = new StringBuilder[n];
        for(int j=0;j<n;j++){
            sba[j] = new StringBuilder();
        }
        while(i<len){
            for(int k=0;k<n && i<len;k++){
                sba[k].append(s.charAt(i++));
            }
            for(int k=n-2;k>0 && i<len;k--){
                sba[k].append(s.charAt(i++));
            }
        }
        for(StringBuilder each : sba){
            sb.append(each.toString());
        }
        return sb.toString();
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  string");
      String str = br.readLine();
      System.out.println("Enter the value of n");
      Integer n = Integer.valueOf(br.readLine());
      System.out.println("The zigzag string is  "+ convert(str,n));
  }

}
