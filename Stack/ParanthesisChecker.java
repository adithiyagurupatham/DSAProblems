/**
Program to check if the paranthesis is valid or not
Link : https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayDeque;
public class ParanthesisChecker{

  static boolean ispar(String x)
    {
        if(x==null || x ==""){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='['){
                stack.push(x.charAt(i));
            }
            else
            {
                if(stack.isEmpty()){
                    return false;
                }
                Character temp = stack.peek();
                Character expected = map.get(temp);
                if(x.charAt(i) != expected){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input string");
    String input = br.readLine();
    System.out.println("The status of paranthesis string is  "+ispar(input));
  }

}
