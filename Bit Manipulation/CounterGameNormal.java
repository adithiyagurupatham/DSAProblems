/**
Link : https://www.hackerrank.com/challenges/counter-game/problem
*/
import java.io.*;
public class CounterGameNormal{
  static boolean isPower(long n){
        return ((n&(n-1))==0);
    }

    static long nextPower(long n){
        long t = n&(~(n-1));
        if(t==0){
            return 1;
        }
        return 1<<(t-1);
    }

    public static String counterGame(long n) {
    if(n==1){
        return "Richard";
    }
    boolean isLouis=true;
        while(true){
            if(isPower(n)){
             n>>=1;
            }
            else{
                n-=(nextPower(n));
            }
            if(n==0 ){
                break;
            }
            isLouis=!isLouis;
        }
        if(isLouis){
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
