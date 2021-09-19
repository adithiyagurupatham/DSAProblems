/**
Program to find the count of subarray  with equal number of 1's and 0's
Link : https://practice.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1/
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
public class EqualBinarySubarrayCountOptimal{

  static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                arr[i] = -1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int count=0,curr=0;
        map.put(curr,1);
        for(int i=0;i<n;i++){
            curr+=arr[i];
            if(map.containsKey(curr)){
                count+=map.get(curr);
            }
           map.merge(curr,1,Integer::sum);
        }
        return count;
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
    System.out.println("The equal subarray count is "
          + countSubarrWithEqualZeroAndOne(array, size));

  }

}
