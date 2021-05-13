/**
Link : https://www.hackerrank.com/challenges/counter-game/problem
*/
import java.io.*;
public class CounterGameOptimised{

  static long countBitCount(long n){
        long ans=0;
        while(n>0){
            n=n&(n-1);
            ans++;
        }
        return ans;
    }



    public static String counterGame(long n) {
    if(n==1){
        return "Richard";
    }
        if((countBitCount(n-1)&1)==1){
            return "Louise";
        }
        else{
            return "Richard";
        }

    }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input");
    Integer input  = Integer.valueOf(br.readLine());
    System.out.println("The winner of the game is "+counterGame(input));
  }
}
