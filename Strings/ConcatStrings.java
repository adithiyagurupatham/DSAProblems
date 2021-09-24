/**
Program to remove the common characters and concatenate the remaining characters
Link : https://practice.geeksforgeeks.org/problems/remove-common-characters-and-concatenate-1587115621/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
public class ConcatStrings{

  static String concatenatedString(String s1,String s2)
    {
        int[] count = new int[256];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]=1;
        }
        for(int i=0;i<s2.length();i++){
            if(count[s2.charAt(i)]==1 || count[s2.charAt(i)] ==2 ){
                count[s2.charAt(i)] = 2;
            }
            else{
                count[s2.charAt(i)] = 3;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(count[s1.charAt(i)]==1 || count[s1.charAt(i)]==3){
                sb.append(s1.charAt(i));
            }
        }
        for(int i=0;i<s2.length();i++){
            if(count[s2.charAt(i)]==1 || count[s2.charAt(i)]==3){
                sb.append(s2.charAt(i));
            }
        }
        return (sb.toString().length()==0)?"-1":sb.toString();

    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the first text");
      String firString = br.readLine();
      System.out.println("Enter the second text");
      String secString = br.readLine();
      System.out.println("The concatenate string is  "+concatenatedString(firString,secString));
  }

}
