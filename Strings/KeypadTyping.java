/**
Program to print the keypad type string
Link : https://practice.geeksforgeeks.org/problems/keypad-typing0119/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
public class KeypadTyping{

  static String printNumber(String s) 
  {
    Map<Character,Integer> map = new HashMap<>();
    for(char i='a';i<='z';i++){
        if(i<='c'){
            map.put(i,2);
        }
        if(i>='d' && i<='f'){
            map.put(i,3);
        }
        if(i>='g' && i<='i'){
            map.put(i,4);
        }
        if(i>='j' && i<='l'){
            map.put(i,5);
        }
        if(i>='m' && i<='o'){
            map.put(i,6);
        }
        if(i>='p' && i<='s'){
            map.put(i,7);
        }
        if(i>='t' && i<='v'){
            map.put(i,8);
        }
        if(i>='w' && i<='z'){
            map.put(i,9);
        }
    }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                sb.append(map.get(s.charAt(i)));
            }
        }
        return sb.toString();
}

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  text");
      String str = br.readLine();
      System.out.println("The keypad number is  "+printNumber(str));
  }

}
