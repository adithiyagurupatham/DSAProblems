/**
Program to find the longest subarray sum
Link : https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
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
public class LongestSubarraySumOptimal{

  static int getLongestSubarraySum(int[] array,int n,int sum){
    int max =0;
    Map<Integer,Integer> map = new HashMap<>();
    int curr=0;
    map.put(curr,-1);
    for(int i=0;i<n;i++){
      curr+=array[i];
      if(map.containsKey(curr-sum)){
        max = Math.max(max,i-map.get(curr-sum));
      }
      map.merge(curr, i, (v1,v2) -> Math.min(v1,v2));
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
