/**
Program to find the longest common sum span subarray of the two arrays
Link : https://practice.geeksforgeeks.org/problems/longest-span-with-same-sum-in-two-binary-arrays5142/1
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
public class LongestSpanSubarraySumNormal{

  static int longestCommonSum(boolean arr[], boolean brr[], int n) {
        int max = 0;
        for(int i=0;i<n;i++){
            int oneSum=0,twoSum=0;
            for(int j=i;j<n;j++){
                oneSum+=(arr[j])?1:0;
                twoSum+=(brr[j])?1:0;
                if(oneSum==twoSum){
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
