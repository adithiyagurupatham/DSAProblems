/**
Program to return the position of the peak element in the unsorted array
Time Complexity : O(logN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class UnsortedPeakElementOptimal{
  static int getPeakElement(int[] array){
    int low=0,high=array.length-1;
    while(low<=high){
      int mid = low+((high-low)/2);
      if((mid ==0 || array[mid]>=array[mid-1]) && (mid == array.length-1 || array[mid]>=array[mid+1])){
        return array[mid];
      }
      if(mid>0 && array[mid-1]>=array[mid]){
        high = mid-1;
      }
      else{
        low = mid+1;
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
