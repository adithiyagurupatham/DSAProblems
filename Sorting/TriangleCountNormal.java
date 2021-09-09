/**
Program to count possible triangle count
Time Complexity : O(N^3)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TriangleCountNormal{


  static int findNumberOfTriangles(int arr[], int n)
  {
      int count=0;
      for(int i=0;i<n-2;i++){
          for(int j=i+1;j<n-1;j++){
              for(int k=j+1;k<n;k++){
                  if(((arr[i]+arr[j])>arr[k]) && ((arr[i]+arr[k])>arr[j])
                  && ((arr[j]+arr[k])>arr[i])){
                      count++;
                  }
              }
          }
      }
      return count;
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
      System.out.println("The total number of possible triangle count is "+findNumberOfTriangles(array,size));
    }
}
