/**
Program to reduce string by removing k identical consecutive elements
Link : https://www.geeksforgeeks.org/reduce-the-string-by-removing-k-consecutive-identical-characters/
Time Complexity : O(S)
Space Complexity : O(S)
*/
import java.io.*;
import java.util.*;

class Pair{
   Character key;
   Integer value;

   Pair(Character key,Integer value){
       this.key=key;
       this.value=value;
   }
   Character getKey(){
       return this.key;
   }
   Integer getValue(){
       return this.value;
   }

}

public class StringReductionOptimal{



  static String reduced_String(int k, String s)
    {
      if(k==1){
            return "";
        }
        Stack<Pair> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(new Pair(s.charAt(i),1));
            }
            else if (stack.peek().getKey().equals(s.charAt(i))){
                int count = stack.peek().getValue();
                stack.push(new Pair(s.charAt(i),count+1));
                if(stack.peek().getValue().equals(k)){
                    int temp = k;
                    while(temp-->0){
                        stack.pop();
                    }
                }
            }
            else{
                stack.push(new Pair(s.charAt(i),1));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop().getKey());
        }
        return sb.reverse().toString();
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input string");
    String input = br.readLine();
    System.out.println("Enter the value of  k");
    Integer k= Integer.valueOf(br.readLine());
    System.out.println("The reduced string is "+reduced_String(k,input));

  }
}
