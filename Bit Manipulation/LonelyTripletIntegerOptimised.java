/**
 Program to find the lonely integer in an array where every other element occurs in triplet
 Link : https://leetcode.com/problems/single-number-ii/
*/
import java.io.*;
public class LonelyTripletIntegerOptimised{

  static int getLonelyElement(int[] nums){
    int ones=0,twos=0;
        for(int i=0;i<nums.length;i++){
            ones = (ones^nums[i]) & (~twos);
            twos = (twos^nums[i]) & (~ones);
        }
        return ones;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    System.out.println("Enter the elements");
    String[] input = br.readLine().split(" ");
    int[] array = new int[number];
    for(int i=0;i<number;i++){
      array[i] = Integer.valueOf(input[i]);
    }
    System.out.println("The lonely element is "+getLonelyElement(array));
  }

}
