/**
Program to find the longest subarray with equal number of 1's and 0's
Link : https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
public class LongestEqualBinarySubarrayOptimal{

  static int maxLen(int[] arr, int n)
    {
      int max =0;
      for(int i=0;i<n;i++){
          if(arr[i]==0){
              arr[i]=-1;
          }
      }
      Map<Integer,Integer> map = new HashMap<>();
      int curr=0;
      map.put(curr,-1);
      for(int i=0;i<n;i++){
          curr+=arr[i];
          if(map.containsKey(curr)){
              max = Math.max(max,i-map.get(curr));
          }
          map.merge(curr,i,(v,w) -> Math.min(v,w));
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
    System.out.println("The longest binary subarray length is "
          + maxLen(array, size));

  }

}
