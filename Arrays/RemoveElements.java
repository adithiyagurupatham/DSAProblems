/**
Program to move element to the last of the array
Link : https://leetcode.com/problems/remove-element/
Time Complexity : O(n)
Space Complexity : O(1)
*/
import java.io.*;
public class RemoveElements{
  static int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int last=nums.length-1,counter=0;
        for(int i=0;i<=last;i++){
            if(nums[i]==val){
                counter++;
                while(last>i && nums[last]==val){
                    last--;
                }
                int temp = nums[last];
                nums[last]=nums[i];
                nums[i]=temp;
            }
        }
        if(counter==0){
            return nums.length;
        }
        return last;
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
