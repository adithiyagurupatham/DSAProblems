/**
Program to remove k elements and provide the lowest possible number as output without leading zeroes
Link : https://www.geeksforgeeks.org/build-lowest-number-by-removing-n-digits-from-a-given-number/
Time Complexity : O(n)
Space Complexity : O(n)
*/
import java.io.*;
import java.util.*;
public class RemoveElements{
  static String removeKdigits(String s, int k)
    {
        if(k>=s.length()){
            return "0";
        }
        if(k==0){
            return s;
        }

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            while(!stack.isEmpty() && (k>0) && stack.peek()>c){
                k--;
                stack.pop();
            }

            if(!stack.isEmpty() || c!='0'){
                stack.push(c);
            }

        }

        while(!stack.isEmpty() && (k>0)){
            k--;
            stack.pop();
        }

        if(stack.isEmpty()){
            return "0";
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
    System.out.println("Enter the element count to be removed");
    Integer k =Integer.valueOf(br.readLine());
    System.out.println("The final output is "+removeKdigits(input,k));
  }

}
