/**
Program to find the stock span
Link : https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class StockSpanNormal{

   static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i-1;j>=0;j--){
                if(price[j]<=price[i]){
                    count++;
                }
                else{
                    break;
                }
            }
            ans[i] = count;
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
