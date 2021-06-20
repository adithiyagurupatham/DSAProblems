/**
Program to find the best time to buy and sell stocks for single transaction
Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Time Complexity : O(N)
*/
import java.io.*;
public class StockAnalysisI{

  static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            if(prices[i]-min>max){
                max=prices[i]-min;
            }
        }
        return max;
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
