/**
 Program to remove all adjacent characters
 Link : https://www.geeksforgeeks.org/remove-first-adjacent-pairs-of-similar-characters-until-possible/
 Time Complexity : O(n) (i.e) we do the deletion of characters at tail
 Space Complexity : O(1)
*/
import java.io.*;
public class RemoveAllAdjacentCharacters{
  static String removeAdjacentDuplicates(String s){
      StringBuilder sb = new StringBuilder();
      for(int i=0;i<s.length();i++){
        if(sb.length()==0 || sb.charAt(sb.length()-1)!=s.charAt(i)){
          sb.append(s.charAt(i));
        }
        else{
          sb.deleteCharAt(sb.length()-1);
        }
      }
      return sb.toString();
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input string");
    String input = br.readLine();
    System.out.println("The adjacent character removed string is "+removeAdjacentDuplicates(input));
  }
}
