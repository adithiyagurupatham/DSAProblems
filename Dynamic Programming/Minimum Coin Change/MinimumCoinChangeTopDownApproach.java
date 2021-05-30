/**
 Find minimum coins required to make up the amount
 Link : https://leetcode.com/problems/coin-change/
*/
import java.util.*;
import java.io.*;
public class MinimumCoinChangeTopDownApproach{

  static int [] dpArray;

  static int coinChange(int[] coins, int amt) {
        if(amt==0){
          return 0;
        }
        if(amt<0){
          return Integer.MAX_VALUE;
        }
        if(dpArray[amt]!=-1){
          return dpArray[amt];
        }
        int min = Integer.MAX_VALUE;
        for(int each : coins){
          int val = coinChange(coins,amt-each);
          if(val<min){
            min=val;
          }
        }
        min = (min == Integer.MAX_VALUE)?Integer.MAX_VALUE:min+1;
        dpArray[amt]=min;
        return min;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the coin array size");
    Integer input = Integer.valueOf(br.readLine());
    System.out.println("Enter the coins");
    String[] arrayString = br.readLine().split(" ");
    int[] array = new int[input];
    for(int i=0;i<arrayString.length;i++){
      array[i] = Integer.valueOf(arrayString[i]);
    }
    System.out.println("Enter the amount");
    Integer amount = Integer.valueOf(br.readLine());
    dpArray= new int[amount+1];
    Arrays.fill(dpArray,-1);
    System.out.println("The minimum number of coins required to make the amount is "
                +coinChange(array,amount));
  }
}
