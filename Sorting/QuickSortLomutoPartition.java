/**
Program to perform quick sort using lomuto partition
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class QuickSortLomutoPartition{

  static void swap(int[] arr,int src,int dest){
      int temp = arr[src];
      arr[src] = arr[dest];
      arr[dest] = temp;
  }

    static void quickSort(int arr[], int low, int high)
    {
      if(low<high){
          int p = partition(arr,low,high);
          quickSort(arr,low,p-1);
          quickSort(arr,p+1,high);
      }
    }

    static int partition(int arr[], int low, int high)
    {
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
      quickSort(array,0,size-1);
      System.out.println("After sorting");
      for(int i=0;i<size;i++){
        System.out.print(array[i]+" ");
      }
      System.out.println();
    }
}
