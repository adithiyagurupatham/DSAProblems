/**
Program to find the maximum number of consecutive one's
Link : https://leetcode.com/problems/max-consecutive-ones/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.*;
public class MaximumConsecutiveOnesNormal{
  static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length,max=0,count=0;
        for(int i=0;i<n;i++){
            int curr=0;
            for(int j=i;j<n;j++){
                if(nums[j]==1){
                    curr++;
                }
                else{
                    break;
                }
            }
            max = Math.max(curr,max);
        }

        return max;
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
    System.out.println("The maximum count of 1's is "+findMaxConsecutiveOnes(array));
  }
}
