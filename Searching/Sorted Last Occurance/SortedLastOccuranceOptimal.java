/**
Program to find the last index of the given value in sorted array
Time Complexity : O(logN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortedLastOccuranceOptimal{

  static int findValue(int[] array,int val){
    int low=0,high=array.length-1;
    while(low<=high){
      int mid = low+((high-low)/2);
      if(array[mid]>val){
        high = mid-1;
      }
      else{
        low = mid+1;
      }
      if(array[mid]==val){
        if(mid==array.length-1 || array[mid+1]!=val){
            return mid;
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
    System.out.println("The last index of the  value is "+findValue(array,value));
  }
}
