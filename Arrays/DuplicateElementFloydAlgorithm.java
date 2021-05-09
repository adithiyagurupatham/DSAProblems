/**
Find the duplicate element in the array of integers in the range [1,n]
Link : https://leetcode.com/problems/find-the-duplicate-number/
Space Complexity : O(1)
Time Complexity : O(N)
*/
import java.io.*;
public class DuplicateElementFloydAlgorithm{
  static int getDuplicate(int[] nums){
    int tortoise = nums[0];
        int hare = nums[0];
        do{
            hare=nums[nums[hare]];
            tortoise=nums[tortoise];
        }while(hare!=tortoise);
        tortoise=nums[0];
        while(tortoise!=hare){
            tortoise=nums[tortoise];
            hare=nums[hare];
        }
        return hare;
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
