/**
Program to find the minimum number of increment required to make the array as unique
Link : https://leetcode.com/problems/minimum-increment-to-make-array-unique/
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/

import java.util.Arrays;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class MinimumIncrementRequired{
  static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                count+=(Math.abs(nums[i]-nums[i-1])+1);
                nums[i] = nums[i-1]+1;
            }
        }
        return count;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The minimum changes required is "+minIncrementForUnique(array));
  }
}
