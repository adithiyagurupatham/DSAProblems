/**
Program to move element to the last of the array
Link : https://leetcode.com/problems/remove-element/
Time Complexity : O(n)
Space Complexity : O(1)
*/
import java.io.*;
public class RemoveElementsOptimal{
  static int removeElement(int[] nums, int val) {
    if(nums.length==0){
      return 0;
    }
    int i=0;
      for(int j=0;j<nums.length;j++){
        if(nums[j]!=val){
          nums[i]=nums[j];
          i++;
        }
      }
      return i;
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
    System.out.println("Enter the value");
    Integer value = Integer.valueOf(br.readLine());
    Integer updatedIndex = removeElement(array,value);
    System.out.println("The final elements are ");
    for(int i=0;i<updatedIndex;i++){
      System.out.println(array[i]);
    }
  }
}
