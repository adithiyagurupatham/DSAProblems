/**
Program to perform three way partition around the range of values
Link : https://practice.geeksforgeeks.org/problems/three-way-partitioning/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ThreeWayPartioning{

  static void swap(int[] arr,int src,int dest){
      int temp = arr[src];
      arr[src] = arr[dest];
      arr[dest] = temp;
  }

  public static void threeWayPartition(int array[], int a, int b)
  {

      int low=0,mid=0,high=array.length-1;
      while(mid<=high){
          if(array[mid]<a){
              swap(array,low,mid);
              mid++;
              low++;
          }
          else if(array[mid]>=a && array[mid]<=b){
              mid++;
          }
          else{
              swap(array,high,mid);
              high--;
          }
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
      System.out.println("Enter the value of a");
      Integer a = Integer.valueOf(br.readLine());
      System.out.println("Enter the value of b");
      Integer b = Integer.valueOf(br.readLine());
      threeWayPartition(array,a,b);
      System.out.println("After partitioning");
      for(int i=0;i<size;i++){
        System.out.print(array[i]+" ");
      }
      System.out.println();
    }
}
