/*
Program to set the blocks within the given range
*/

import java.io.*;
import java.lang.*;
public class BlockSet{

  static int setBlock(int number,int start,int end){
    int setBits = Math.abs(start-end)+1;
    int maxBitValue = (1<<setBits)-1; // equivalent of (2^setBits)-1
    int modifiedValue = maxBitValue<<setBits;
    return modifiedValue | number;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number");
    Integer number = Integer.valueOf(br.readLine());
    System.out.println("Enter the start range");
    Integer start = Integer.valueOf(br.readLine());
    System.out.println("Enter the end range");
    Integer end = Integer.valueOf(br.readLine());
    System.out.println("The answer is "+setBlock(number,start,end));
  }

}
