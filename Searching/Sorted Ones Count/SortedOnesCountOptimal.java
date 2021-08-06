/**
Program to count the number of 1's in sorted binary array
Time Complexity : O(logN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortedOnesCountOptimal{

  static int getFirstOccurance(int[] array,int val){
    int low =0,high = array.length-1;
    while(low<=high){
      int mid = low + ((high-low)/2);
      if(array[mid]>=val){
        high = mid-1;
      }
      else{
        low = mid+1;
      }
      if(array[mid] == val){
        if(mid==0 || array[mid-1]!=array[mid]){
          return mid;
        }
      }
    }
    return -1;
  }

  static int getOnesCount(int[] array){
    int firstOccurance = getFirstOccurance(array,1);
    if(firstOccurance==-1){
      return 0;
    }
    return array.length - firstOccurance;
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
    System.out.println("The one's count is "+getOnesCount(array));
  }
}
