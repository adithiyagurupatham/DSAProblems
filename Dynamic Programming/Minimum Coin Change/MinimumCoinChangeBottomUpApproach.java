/**
 Find minimum coins required to make up the amount
 Link : https://leetcode.com/problems/coin-change/
*/
import java.util.*;
import java.io.*;
public class MinimumCoinChangeBottomUpApproach{

  static int coinChange(int[] coins, int amt) {
        int[] arr = new int[amt+1];
        Arrays.fill(arr,amt+1);
        arr[0]=0;
        for(int i=1;i<=amt;i++){
            for(int coin : coins){
                int temp = (i-coin);
                if(temp>=0){
                    arr[i] = Math.min(arr[i],arr[temp]+1);
                }
            }
        }
        if(arr[amt]==amt+1){
            return -1;
        }
        return arr[amt];
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
    System.out.println("The minimum number of coins required to make the amount is "
                +coinChange(array,amount));
  }
}
