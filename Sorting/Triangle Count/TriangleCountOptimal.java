/**
Program to count possible triangle count
Link : https://practice.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class TriangleCountOptimal{

  static int findCount(int[] arr,int start,int end,int x){
        int count=0;
        while(start<end){
            if((arr[start]+arr[end])>x){
                count+=(end-start);
                end--;
            }
            else {
                start++;
            }
        }
        return count;
    }


  static int findNumberOfTriangles(int arr[], int n)
  {
    int count=0;
      Arrays.sort(arr);
      for(int i=n-1;i>=2;i--){
         count+=findCount(arr,0,i-1,arr[i]);
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
