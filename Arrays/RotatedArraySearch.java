/**
Program to search element in sorted rotated array
Link : https://leetcode.com/problems/search-in-rotated-sorted-array/
Time Complexity : O(logN)
*/
import java.io.*;
public class RotatedArraySearch{
  static int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid = low + ((high-low)/2);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[low]){
                if(target>=nums[low] && target<nums[mid]){
                     high = mid-1;
                }
                else{
                    low=mid+1;
                }

            }
            else{
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("Enter the number to search");
    Integer target = Integer.valueOf(br.readLine());
    System.out.println("The element is found in the index "+search(array,target));
  }
}
