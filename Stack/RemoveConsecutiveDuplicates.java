/**
Program to remove the consecutive duplicates in the given string
Link : https://practice.geeksforgeeks.org/problems/removing-consecutive-duplicates-1587115621/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayDeque;
public class RemoveConsecutiveDuplicates{

  static String removeConsecutiveDuplicates(String str)
    {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            if(stack.isEmpty() || stack.peek()!=str.charAt(i)){
                stack.push(str.charAt(i));
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
    System.out.println("The final string is  "+removeConsecutiveDuplicates(input));
  }

}
