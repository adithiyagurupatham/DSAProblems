/**
Program to find the maximum occuring Character of the string
Link : https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(256)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class FindMaxOccuringCharacter{

  static char getMaxOccuringChar(String line)
    {
        int[] count = new int[256];
        for(int i=0;i<line.length();i++){
            count[line.charAt(i)]++;
        }
        int max = Integer.MIN_VALUE,ans=0;
        for(int i=0;i<256;i++){
            if(count[i]>max){
                max=count[i];
                ans=i;
            }
        }
        return (char)ans;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  text");
      String str = br.readLine();
      System.out.println("The maximum occuring character is "+getMaxOccuringChar(str));
  }

}
