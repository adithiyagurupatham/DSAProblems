/**
Program to find the longest consecutive subsequence
Link : https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1/
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
public class LongestConsecutiveSubsequenceNormal{

  static int findLongestConseqSubseq(int arr[], int N)
    {
      int curr=1,max=1;
      Arrays.sort(arr);
      for(int i=1;i<N;i++){
        if(arr[i]==arr[i-1]){
            continue;
        }
        if(arr[i]==arr[i-1]+1){
          curr++;
          max = Math.max(curr,max);
        }
        else{
          curr=1;
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
    System.out.println("The longest consecutive subsequence is "
          + findLongestConseqSubseq(array, size));

  }

}
