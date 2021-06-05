/**
 Program to find first non repeating character
 Complexity : O(n^2)
*/
import java.io.*;
public class FirstNonRepeatingCharacterShorterCode{

  static Character getFirstNonRepeatingCharacter(String input){
    for(int i=0;i<input.length();i++){
      if(input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))){
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
