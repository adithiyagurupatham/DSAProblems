/**
Program to find the maximum occuring element in the range query
Time Complexity : O(N^2)
Space Complexity : O(?)
*/
import java.io.*;
import java.util.*;
public class MaximumOccuringRangeElementNormal{

  static int getMaximumOccuringElement(int[] start,int[] end){
    Map<Integer,Integer> hashMap = new HashMap<>();
    for(int i=0;i<start.length;i++){
      for(int j=start[i];j<=end[i];j++){
        hashMap.merge(j,1,Integer :: sum);
      }
    }
    int maxCount = Integer.MIN_VALUE,max = Integer.MIN_VALUE;
    for(Map.Entry<Integer,Integer> each : hashMap.entrySet()){
      if(each.getValue()>maxCount){
        maxCount = each.getValue();
        max = each.getKey();
      }
    }
    return max;
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
