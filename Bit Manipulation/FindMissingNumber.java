/**
 Find missing number from given array [1 .. n+1]
*/

import java.io.*;
public class FindMissingNumber{

  static int getMissingNumber(int[] array){
    int normalXorValue=0;
    int arrayXorValue=0;
    for(int i=1;i<=array.length+1;i++){
      normalXorValue ^=i;
    }
    for(int each : array){
      arrayXorValue ^=each;
    }
    int ans = normalXorValue ^ arrayXorValue;
    return ans;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    System.out.println("Enter the elements");
    String[] input = br.readLine().split(" ");
    int[] array = new int[number];
    for(int i=0;i<number;i++){
      array[i] = Integer.valueOf(input[i]);
    }
    System.out.println("The missing number is "+getMissingNumber(array));
  }
}
