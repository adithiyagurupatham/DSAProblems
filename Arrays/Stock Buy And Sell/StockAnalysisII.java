/**
 Program to buy and sell stock in multiple days and to get the maximum profit
 Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 Time Complexity : O(N)
 Space Complexity : O(1)
*/
import java.io.*;
public class StockAnalysisII{
  static int maxProfit(int[] prices) {
    int maxProfit=0;
    for(int i=1;i<prices.length;i++){
      if(prices[i]>prices[i-1]){
        maxProfit+=(prices[i]-prices[i-1]);
      }
    }
    return maxProfit;
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
    System.out.println("The max profit for the given stocks is "+maxProfit(array));
  }
}
