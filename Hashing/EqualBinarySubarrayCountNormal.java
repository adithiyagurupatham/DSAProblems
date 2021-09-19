/**
Program to find the count of subarray  with equal number of 1's and 0's
Link : https://practice.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1/
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
public class EqualBinarySubarrayCountNormal{

  static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        int count=0,curr=0;
        for(int i=0;i<n;i++){
            int zero=0,one=0;
            for(int j=i;j<n;j++){
                if(arr[j]==0){
                    zero++;
                }
                else{
                    one++;
                }
                if(zero==one){
                    count++;
                }
            }
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
