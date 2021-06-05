/**
 Program to find first non repeating character
 Complexity : O(n^2)
*/
import java.io.*;
public class FirstNonRepeatingCharacterNormal{

  static Character getFirstNonRepeatingCharacter(String input){
    for(int i=0;i<input.length();i++){
      boolean isRepeating = false;
      for(int j=0;j<input.length();j++){
        if(input.charAt(i)==input.charAt(j) && i!=j){
          isRepeating=true;
          break;
        }
      }
      if(!isRepeating){
        return input.charAt(i);
      }
    }
    return '_';
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input string");
    String input = br.readLine();
    System.out.println("The first non repeating character is "+getFirstNonRepeatingCharacter(input));
  }
}
