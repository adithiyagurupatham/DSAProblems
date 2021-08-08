/**
Program to return the position of the peak element in the unsorted array
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class UnsortedPeakElementNormal{
  static int getPeakElement(int[] array){
    if(array[0]>=array[1]){
      return array[0];
    }
    if(array[array.length-1]>=array[array.length-2]){
      return array[array.length-1];
    }
    for(int i=1;i<array.length-1;i++){
      if((array[i]>=array[i-1]) && (array[i]>=array[i+1])){
        return array[i];
      }
    }
    return -1;
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
    System.out.println("The peak element  is "+getPeakElement(array));
  }
}
