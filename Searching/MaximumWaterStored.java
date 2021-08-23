/**
Program to find the maximum water that can be trapped between two buildings
Link : https://practice.geeksforgeeks.org/problems/maximum-water-between-two-buildings/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MaximumWaterStored{

  static int maxWater(int height[], int n)
    {
        int left=0,right=height.length-1,water=0;
        while(left<right){
            int temp = Math.min(height[left],height[right]);
            water = Math.max(water,temp*(right-left-1));
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return water;
    }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the  input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The maximum water that can be stored is "+maxWater(array, size));
  }
}
