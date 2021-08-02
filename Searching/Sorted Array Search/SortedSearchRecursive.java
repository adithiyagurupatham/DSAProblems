/**
Program to find the index of the given value in sorted array
Time Complexity : O(logN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortedSearchRecursive{

  static int findValue(int[] array,int val,int low,int high){
      if(low>high){
        return -1;
      }
      int mid = low+((high-low)/2);
      if(array[mid]==val){
        return mid;
      }
      if(array[mid]>val){
        return findValue(array,val,low,mid-1);
      }
      else{
        return findValue(array,val,mid+1,high);
      }
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
    System.out.println("The index of the value is "+findValue(array,value,0,size-1));
  }
}
