/**
Program to reverse all individual words of the string seperated by dot
Link : https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.lang.StringBuilder;
public class WordReverseNormal{
  static String reverseWords(String S)
    {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='.'){
                stack.push(sb.toString());
                sb.setLength(0);
            }
            else{
                sb.append(S.charAt(i));
            }
        }
        if(sb.length()>0){
            stack.push(sb.toString());
            sb.setLength(0);
        }
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
            sb.append(".");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  text");
      String str = br.readLine();
      System.out.println("The reversed string is " + reverseWords(str));
  }

}
