/**
Program to find if the k length subarray sum exists or not
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.*;
public class KlengthSubarraySum{

  static boolean isSubarraySumPresent(int[] array,int k,int sum){
    int curr=0;
    for(int i=0;i<k;i++){
      curr+=array[i];
    }
    if(curr==sum){
      return true;
    }
    for(int i=k;i<array.length;i++){
      curr-=array[i-k];
      curr+=array[i];
      if(curr==sum){
        return true;
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
    System.out.println("Enter the value of k");
    Integer k = Integer.valueOf(br.readLine());
    System.out.println("Enter the value of sum");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The K sub array sum status "+isSubarraySumPresent(array,k,sum));
  }
}
