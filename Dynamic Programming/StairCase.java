/*
   Find the maximum possible number of ways to reach nth staircase if we can move the staircase by 1 step or 2 step at a time
*/

import java.util.*;
import java.io.*;
public class StairCase{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer input = Integer.valueOf(br.readLine());
    System.out.println(getPossibleWays(input));
  }

  static int getPossibleWays(Integer input){
    if(input<=2){
      return input;
    }
    int[] possibleWays = new int[input+1];
    possibleWays[1]=1;
    possibleWays[2]=2;
    for(int i=3;i<=n;i++){
      possibleWays[i] = possibleWays[i-1]+possibleWays[i-2];
    }
    return possibleWays[n];
  }

}
