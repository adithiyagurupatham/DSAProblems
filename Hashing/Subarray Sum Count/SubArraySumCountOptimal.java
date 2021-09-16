/**
Program to count the number of subarray sum in the given array
Link : https://practice.geeksforgeeks.org/problems/subarray-range-with-given-sum0128/1/
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
public class SubArraySumCountOptimal{

  static int subArraySumCount(int arr[], int n, int sum)
    {
      int ans=0;
      Map<Integer,Integer> map = new HashMap<>();
      int curr=0;
      map.put(curr,1);
      for(int each : arr){
          curr+=each;
          if(map.containsKey(curr-sum)){
              ans+=map.get(curr-sum);
          }
          map.merge(curr,1,Integer :: sum);
      }
      return ans;
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
    System.out.println("Enter the sum which need to be checked");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The  subarray sum count is "
          +subArraySumCount(array, size,sum));

  }

}
