/**
Program to convert all elements as same with minimum number of consecutive flips
Link : https://www.geeksforgeeks.org/minimum-group-flips-to-make-binary-array-elements-same/
Time Complexity : O(N)
SPace Complexity : O(1)
*/
import java.io.*;
public class MinimumGroupFlipsOptimal{
  static void printMinimumGroupFlips(int[] array){
    for(int i=1;i<array.length;i++){
      if(array[i]!=array[i-1]){
        if(array[i]!=array[0]){
          System.out.print("Start: "+i);
        }
        else{
          System.out.print(" End : "+(i-1));
          System.out.println();
        }
      }
    }
    if(array[array.length-1]!=array[0]){
      System.out.print(" End : "+(array.length-1));
      System.out.println();
    }
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    printMinimumGroupFlips(array);
  }
}
