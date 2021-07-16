/**
Program to check if there is an equilibrium point or not
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.*;
public class EquilibriumPointBest{

  static boolean isEquilibrium(int[] array){
    boolean isEquilibrium = false;
    int leftSum=0,totalSum=0;
    for(int each : array){
      totalSum+=each;
    }
    for(int i=0;i<array.length;i++){
      int rightSum = totalSum-leftSum-array[i];
      // System.out.println("For i = "+i+" left sum is "+leftSum+" and right sum is "+rightSum);
      if(leftSum==rightSum){
        isEquilibrium=true;
        break;
      }
      leftSum+=array[i];
    }
    return isEquilibrium;
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
    System.out.println("The status of equilibrium is "+isEquilibrium(array));
  }
}
