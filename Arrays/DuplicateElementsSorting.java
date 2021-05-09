/**
Find the duplicate element in the array of integers in the range [1,n]
Link : https://leetcode.com/problems/find-the-duplicate-number/
Space Complexity : O(n)
Time Complexity : O(NLogN)
*/
import java.io.*;
import java.util.*;
public class DuplicateElementsSorting{
  static int getDuplicate(int[] nums){
    Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
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
    System.out.println("The duplicate element is "+getDuplicate(array));

  }
}
