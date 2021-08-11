/**
Program to find the longest valid paranthesis
Link : https://practice.geeksforgeeks.org/problems/longest-valid-parentheses5657/1#
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
public class LongestValidParanthesisNormal{
  static int maxLength(String S){
        Integer max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(c=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    int len = i-stack.peek();
                    max = Math.max(len,max);
                }
            }
        }
        return max;
    }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the paranthesis ");
    String input = br.readLine();
    System.out.println("The longest valid paranthesis length is "+maxLength(input));
  }
}
