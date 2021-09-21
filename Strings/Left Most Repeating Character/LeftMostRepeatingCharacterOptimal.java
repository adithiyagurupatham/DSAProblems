/**
Program to find the index of the left most repeating character
Link : https://practice.geeksforgeeks.org/problems/repeating-character-first-appearance-leftmost/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
public class LeftMostRepeatingCharacterOptimal{


  static int repeatedCharacter(String S)
    {
        boolean[] visited = new boolean[256];
        int res=-1;
        for(int i=S.length()-1;i>=0;i--){
            if(visited[S.charAt(i)]){
                res=i;
            }
            else{
                visited[S.charAt(i)] = true;
            }
        }
        return res;


    }


  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the first string");
      String str = br.readLine();
      System.out.println("The left most repeating character index is "+repeatedCharacter(str));
  }

}
