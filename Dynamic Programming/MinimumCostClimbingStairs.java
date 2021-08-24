/**
Program to find the minimum cost required to reach the top of the stair case
Link : https://practice.geeksforgeeks.org/problems/min-cost-climbing-stairs/1
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class MinimumCostClimbingStairs{
  static int minCostClimbingStairs(int[] cost , int N) {
        int step1=0,step2=0,currentStep;
        for(int i=0;i<N;i++){
            currentStep = cost[i]+Math.min(step1,step2);
            step1 = step2;
            step2 = currentStep;
        }
        return Math.min(step1,step2);
    }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the stair case array size");
    Integer input = Integer.valueOf(br.readLine());
    System.out.println("Enter the cost");
    String[] arrayString = br.readLine().split(" ");
    int[] array = new int[input];
    for(int i=0;i<arrayString.length;i++){
      array[i] = Integer.valueOf(arrayString[i]);
    }
    System.out.println("The minimum cost required is "+minCostClimbingStairs(array, input));
  }
}
