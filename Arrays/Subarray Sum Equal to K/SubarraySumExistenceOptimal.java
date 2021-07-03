/**
Program to find if the given subarray sum exists or not in the array of *non - negative* integers
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.*;
public class SubarraySumExistenceOptimal{
  static boolean isSubarrayExist(int[] array,int sum){
    int currSum=array[0],s=0;
    for(int e=1;e<array.length;e++){
      while(currSum>sum && s<e-1){
        currSum-=array[s];
        s++;
      }
      if(currSum==sum){
        return true;
      }
      if(e<array.length){
        currSum+=array[e];
      }
    }
    return (currSum==sum);
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
