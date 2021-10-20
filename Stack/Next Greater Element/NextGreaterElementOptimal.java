/**
Program to find the next greater element
Link : https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;
public class NextGreaterElementOptimal{

  static long[] nextLargerElement(long[] arr, int n)
   {
     long[] ans = new long[n];
      ans[n-1]=-1;
      Deque<Long> stack = new ArrayDeque<>();
      stack.push(arr[n-1]);
      for(int i=n-2;i>=0;i--){
          while(!stack.isEmpty() && stack.peek()<arr[i])
              stack.pop();
          ans[i] = (stack.isEmpty())?-1:stack.peek();
          stack.push(arr[i]);
      }
      return ans;
   }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    long[] array = new long[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Long.valueOf(stringArray[i]);
    }
    System.out.println("The next greater element array is "+Arrays.toString(nextLargerElement(array,number)));
  }
}
