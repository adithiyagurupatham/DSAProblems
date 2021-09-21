/**
Program to reverse all individual words of the string seperated by dot
Link : https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.lang.StringBuilder;
public class WordReverseOptimal{

  static void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

  static void reverseArray(char[] array){
        int start=0;
        for(int end=0;end<array.length;end++){
            if(array[end]=='.'){
                reverse(array,start,end-1);
                start=end+1;
            }
        }
        reverse(array,start,array.length-1);
        reverse(array,0,array.length-1);
    }


    static String reverseWords(String S)
    {
        char[] arr = S.toCharArray();
        reverseArray(arr);
        return new String(arr);
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  text");
      String str = br.readLine();
      System.out.println("The reversed string is " + reverseWords(str));
  }

}
