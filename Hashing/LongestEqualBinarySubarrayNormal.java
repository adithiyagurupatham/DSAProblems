/**
Program to find the longest subarray with equal number of 1's and 0's
Link : https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1
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
public class LongestEqualBinarySubarrayNormal{

  static int maxLen(int[] arr, int n)
    {
        int max =0;
        for(int i=0;i<n;i++){
            int zeroCount =0 ,oneCount=0;
            for(int j=i;j<n;j++){
                if(arr[j]==1){
                    oneCount++;
                }
                else{
                    zeroCount++;
                }
                if(oneCount==zeroCount){
                    max = Math.max(max,j-i+1);
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
    System.out.println("The longest binary subarray length is "
          + maxLen(array, size));

  }

}
