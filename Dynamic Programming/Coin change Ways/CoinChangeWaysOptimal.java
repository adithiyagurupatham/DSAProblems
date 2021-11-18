/*
   Program to total number of possible ways to change coin
   Link : https://practice.geeksforgeeks.org/problems/coin-change-number-of-ways/1/
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CoinChangeWaysOptimal{

  static long numberOfWays(int coins[],int n,int val)
    {
        if(val==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        long res = numberOfWays(coins,n-1,val);
        if(coins[n-1]<=val){
            res+=(numberOfWays(coins,n,val-coins[n-1]));
        }
        return res;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the coin array size");
    Integer n = Integer.valueOf(br.readLine());
    System.out.println("Enter the coins");
    String input = br.readLine();
    String[] inputString = input.split(" ");
    int[] coins = new int[n];
    for(int i=0;i<n;i++){
      coins[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the value ");
    Integer val = Integer.valueOf(br.readLine());
    System.out.println("The total number of ways is  "+numberOfWays(coins, n, val));
  }



}
