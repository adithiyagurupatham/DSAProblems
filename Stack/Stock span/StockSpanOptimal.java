/**
Program to find the stock span
Link : https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayDeque;
public class StockSpanOptimal{

   static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int[] ans = new int[n];
        ans[0]=1;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for(int i=1;i<n;i++){
            while((!stack.isEmpty()) && price[stack.peek()]<=price[i])
                stack.pop();
            ans[i] = (stack.isEmpty())?i+1:i-stack.peek();
            stack.push(i);
        }
        return ans;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The stock span is "+Arrays.toString(calculateSpan(array,number)));
  }
}
