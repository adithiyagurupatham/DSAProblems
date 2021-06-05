/**
 Program to find first non repeating character
 Complexity : O(n^2)
*/
import java.io.*;
import java.util.*;
public class FirstNonRepeatingCharacterOptimized{

  static Character getFirstNonRepeatingCharacter(String input){
    Map<Character,Integer> hashMap = new HashMap<>();
    char[] charArray = input.toCharArray();
    for(Character each : charArray){
      hashMap.merge(each,1,Integer::sum);
    }
    for(Character each : charArray){
      if(hashMap.get(each)==1){
        return each;
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
