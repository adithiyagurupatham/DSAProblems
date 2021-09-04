/**
Program to find the Kth smallest element of the given array
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class KthSmallestElementOptimal{
  
  static void swap(int[] arr,int src,int dest){
       int temp = arr[src];
       arr[src] = arr[dest];
       arr[dest] = temp;
   }

   static int getPartition(int[] arr,int low,int high){
       int pivot = arr[high];
       int i=low-1;
       for(int j=low;j<high;j++){
           if(arr[j]<=pivot){
               i++;
               swap(arr,i,j);
           }
       }
       swap(arr,i+1,high);
       return i+1;
   }


   static int kthSmallest(int arr[], int n, int k)
    {
      int low=0,high = n-1;
      while(low<=high){
          int p = getPartition(arr,low,high);
          if(p==k-1){
              return arr[p];
          }
          else if(p<k-1){
              low=p+1;
          }
          else{
              high = p-1;
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
    System.out.println("Enter the value of k");
    Integer k = Integer.valueOf(br.readLine());
    System.out.println("is kth smallest element is "+kthSmallest(array, size, k));
  }
}
