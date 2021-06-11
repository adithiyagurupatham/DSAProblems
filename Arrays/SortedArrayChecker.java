/**
Program to check if array is sorted
Complexity : O(N)
*/
import java.io.*;
public class SortedArrayChecker{
  static boolean isArraySorted(int[] array){
    boolean isSorted = true;
    for(int i=0;i<array.length-1;i++){
      if(array[i]>array[i+1]){
        return false;
      }
    }
    return isSorted;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The array is sorted "+isArraySorted(array));
  }
}
