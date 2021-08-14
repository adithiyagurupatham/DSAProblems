/**
Program to return the repetitive element and its count in the consecutive sorted array
Link : https://practice.geeksforgeeks.org/problems/count-only-repeated2047/1
Time Complexity : O(logN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.Point;
public class CountOnlyRepeatedBest{

  static Point findRepeating(int arr[],int n)
    {
      int repetitiveCount = n-(arr[n-1]-arr[0]);
      if(repetitiveCount <=1 ){
          return new Point(-1,-1);
      }
      int low=0,high=n-1;
      while(low<=high){
          int mid = low+((high-low)/2);
          if(arr[mid]<arr[0]+mid){
              high=mid-1;
          }
          else{
              low=mid+1;
          }
      }
      return new Point(arr[high],repetitiveCount);

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
    Point point = findRepeating(array,size);
    System.out.println("The repetitive element is "+point.x+" and the repetitive count is  "+point.y);
  }
}
