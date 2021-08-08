/**
Program to check if there exist the sum pair in the given sorted array
Time Complexity : O(logN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortedSumPairTwoPointerApproach{
  static boolean doesPairExist(int[] array,int value){
    int left=0,right=array.length-1;
    while(left<right){
      if(array[left]+array[right]==value){
        return true;
      }
      if(array[left]+array[right]>value){
        right--;
      }
      else{
        left++;
      }
    }
    return false;
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
    System.out.println("Enter the sum which need to be checked");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The sum pair status is "+doesPairExist(array,sum));
  }
}
