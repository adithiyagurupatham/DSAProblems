/**
Program to find the maximum occuring element in the range query
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.*;
import java.util.*;
public class MaximumOccuringRangeElementOptimal{

  static int getMaximumOccuringElement(int[] start,int[] end){
    int reqSize = Integer.MIN_VALUE,max = Integer.MIN_VALUE,maxIndex = Integer.MIN_VALUE;
    for(int each : end){
      if(each>reqSize){
        reqSize=each;
      }
    }
    int[] tempArray = new int[reqSize+2];
    Arrays.fill(tempArray,0);
    for(int each :start){
      tempArray[each]=tempArray[each]+1;
    }
    for(int each : end){
      tempArray[each+1] = tempArray[each+1]-1;
    }
    for(int i=1;i<tempArray.length;i++){
      tempArray[i] = tempArray[i]+tempArray[i-1];
    }
    // System.out.println("The temp array is ");
    for(int i=0;i<tempArray.length;i++)
    {
      if(tempArray[i]>max){
        max = tempArray[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] start = new int[size];
    System.out.println("Enter the start range  elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      start[i] = Integer.valueOf(inputString[i]);
    }
    int[] end = new int[size];
    System.out.println("Enter the end range  elements");
    inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      end[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The maximum occuring element is "+getMaximumOccuringElement(start,end));
  }
}
