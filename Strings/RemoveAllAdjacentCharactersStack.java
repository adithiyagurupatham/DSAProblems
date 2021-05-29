/**
 Program to remove all adjacent characters
 Link : https://www.geeksforgeeks.org/remove-first-adjacent-pairs-of-similar-characters-until-possible/
 Time Complexity : O(n) (i.e) we do the deletion of characters at tail
 Space Complexity : O(1)
*/
import java.io.*;
import java.util.*;
public class RemoveAllAdjacentCharactersStack{
  static String removeAdjacentDuplicates(String s){
    Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty() || s.charAt(i)!=stack.peek()){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input string");
    String input = br.readLine();
    System.out.println("The adjacent character removed string is "+removeAdjacentDuplicates(input));
  }
}
