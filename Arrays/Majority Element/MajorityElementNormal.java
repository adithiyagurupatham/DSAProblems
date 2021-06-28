/**
 Program to find the majority of the elements of array (occuring more than n/2 times)
 It assumes that there is one majority element present
 Link : https://leetcode.com/problems/majority-element/
 Time Complexity : O(N^2)
 Space Complexity : O(1)
*/
import java.io.*;
public class MajorityElementNormal{
  static int getMajorityElement(int[] nums){
    for(int i=0;i<nums.length;i++){
      int count=1;
      for(int j=i+1;j<nums.length;j++){
        if(nums[j]==nums[i]){
          count++;
        }
      }
      if(count>nums.length/2){
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
    System.out.println("The majority element is "+getMajorityElement(array));
  }
}
