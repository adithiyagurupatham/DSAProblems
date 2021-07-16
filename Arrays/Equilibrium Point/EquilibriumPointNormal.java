/**
Program to check if there is an equilibrium point or not
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.*;
public class EquilibriumPointNormal{

  static boolean isEquilibrium(int[] array){
    boolean isEquilibrium = false;
    for(int i=0;i<array.length;i++){
      int leftSum=0,rightSum=0;
      for(int j=0;j<i;j++){
        leftSum+=array[j];
      }
      for(int k=i+1;k<array.length;k++){
        rightSum+=array[k];
      }
      if(leftSum==rightSum){
        isEquilibrium=true;
        break;
      }
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
