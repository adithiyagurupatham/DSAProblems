/**
Program to find the longest valid paranthesis
Link : https://practice.geeksforgeeks.org/problems/longest-valid-parentheses5657/1#
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
public class LongestValidParanthesisOptimal{
  static int longestValidParentheses(String s) {
        int open=0,close=0,max=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                open++;
            }
            else{
                close++;
            }
            if(close==open){
                max = Math.max(max,open+close);
            }
            if(close>open){
                close=0;open=0;
            }
        }
        open=0;
        close=0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(c == '('){
                open++;
            }
            else{
                close++;
            }
            if(close==open){
                max = Math.max(max,open+close);
            }
            if(open>close){
                close=0;open=0;
            }
        }
        return max;
    }


  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the paranthesis ");
    String input = br.readLine();
    System.out.println("The longest valid paranthesis length is "+longestValidParentheses(input));
  }
}
