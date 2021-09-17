/**
Program to find the longest subarray sum
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
public class LongestSubarraySumNormal{

  static int getLongestSubarraySum(int[] array,int n,int sum){
    int max = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      int currSum=0;
      for(int j=i;j<n;j++){
        currSum+=array[j];
        if(currSum==sum){
          max = Math.max(max, j-i+1);
        }
      }
    }
    return max;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("Enter the subarray sum ");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The longest subarray sum length is "
          + getLongestSubarraySum(array, size, sum));

  }

}
