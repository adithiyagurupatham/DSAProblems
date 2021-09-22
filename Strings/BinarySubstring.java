/**
Program to find the total number of subString begin and end at 1
Link : https://practice.geeksforgeeks.org/problems/binary-string-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BinarySubstring{

  static int binarySubstring(String str)
    {
        int ans=0,zeroCount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                zeroCount++;
                ans+=(zeroCount-1);
            }
        }
        return ans;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  text");
      String str = br.readLine();
      System.out.println("The binary subString count is  "+binarySubstring(str));
  }

}
