/**
Program to check if there is an equilibrium point or not
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.*;
public class EquilibriumPointOptimal{

  static int getRangeSum(int[] prefixArray,int l,int r){
    if(r<0){
      return 0;
    }
    if(l<=0){
      return prefixArray[r];
    }
    return prefixArray[r]-prefixArray[l-1];
  }

  static boolean isEquilibrium(int[] prefixArray){
    boolean isEquilibrium = false;
    for(int i=0;i<prefixArray.length;i++){
      int leftSum = getRangeSum(prefixArray,0,i-1);
      int rightSum = getRangeSum(prefixArray,i+1,prefixArray.length-1);
      // System.out.println("For i = "+i+" left sum is "+leftSum+" and right sum is "+rightSum);
      if(leftSum==rightSum){
        isEquilibrium=true;
        break;
      }
    }
    return isEquilibrium;
  }

  static int[] getPrefixSumArray(int[] array){
    int[] prefixArray = new int[array.length];
    prefixArray[0]=array[0];
    for(int i=1;i<array.length;i++){
      prefixArray[i] = array[i]+prefixArray[i-1];
    }
    return prefixArray;
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
    int[] prefixArray = getPrefixSumArray(array);
    System.out.println("The status of equilibrium is "+isEquilibrium(prefixArray));
  }
}
