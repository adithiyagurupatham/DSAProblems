/**
Program to print the prefix sum array of the given array
Time Complexity : O(N)
SPace Complexity : O(N)
*/
import java.io.*;
public class PrefixSum{

  static void printPrefixSum(int[] array){
    int[] prefixArray = new int[array.length];
    prefixArray[0]=array[0];
    for(int i=1;i<array.length;i++){
      prefixArray[i] = array[i]+prefixArray[i-1];
    }
    System.out.println("The prefix sum array is ");
    for(int each : prefixArray){
      System.out.print(each+" ");
    }
    System.out.println();
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
    printPrefixSum(array);
  }
}
