/**
Program to find the position of the element in sorted rotated array
Time Complexity : O(logN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortedRotatedArraySearchOptimal{

  static int getPosition(int[] array,int value){
    int low=0,high = array.length-1;
    while(low<=high){
      int mid = low + ((high-low)/2);
      if(array[mid]==value){
        return mid;
      }
      if(array[low]<array[mid]){
        if(array[low]<=value && array[mid]>value){
          high = mid-1;
        }
        else{
          low = mid+1;
        }
      }
      else{
        if(array[high]>=value && array[mid]<value){
          low=mid+1;
        }
        else{
          high = mid-1;
        }
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
    System.out.println("Enter the value to be searched");
    Integer value = Integer.valueOf(br.readLine());
    System.out.println("The position of the element is "+getPosition(array,value));
  }
}
