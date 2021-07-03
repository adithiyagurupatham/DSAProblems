/**
Program to find if the given subarray sum exists or not in the array of *non - negative* integers
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.*;
public class SubarraySumExistenceNormal{
  static boolean isSubarrayExist(int[] array,int sum){
    for(int i=0;i<array.length;i++){
      int currSum=0;
      for(int j=i;j<array.length;j++){
        currSum+=array[j];
        if(currSum==sum){
          return true;
        }
      }
    }
    return false;
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
    System.out.println("Enter the value of sum");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The subarray sum existence : "+isSubarrayExist(array,sum));
  }
}
