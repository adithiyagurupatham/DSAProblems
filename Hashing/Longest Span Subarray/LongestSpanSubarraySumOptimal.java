/**
Program to find the longest common sum span subarray of the two arrays
Link : https://practice.geeksforgeeks.org/problems/longest-span-with-same-sum-in-two-binary-arrays5142/1
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
public class LongestSpanSubarraySumOptimal{

  static int longestCommonSum(boolean arr[], boolean brr[], int n) {
        int max = 0,curr=0;
        Map<Integer,Integer> map = new HashMap<>();
        Integer[] temp= new Integer[n];
        map.put(curr,-1);
        for(int i=0;i<n;i++){
            int oneSum=(arr[i])?1:-1;
            int twoSum=(brr[i])?1:-1;
            temp[i] = oneSum-twoSum;
        }
        for(int i=0;i<n;i++){
            curr+=temp[i];
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
    boolean[] array = new boolean[size];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Boolean.valueOf(stringArray[i]);
    }
    boolean[] array1 = new boolean[size];
    System.out.println("Enter the second array elements");
    stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array1[i] = Boolean.valueOf(stringArray[i]);
    }
    System.out.println("The longest span sum length is "
          + longestCommonSum(array,array1,size));

  }

}
