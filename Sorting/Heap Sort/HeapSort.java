/**
Program to perform heap Sort
Best Time Complexity : O(NlogN)
Average Time Complexity : O(NlogN)
Worst Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HeapSort{

  static void swap(int[] arr,int src,int dest){
      int temp = arr[src];
      arr[src] = arr[dest];
      arr[dest] = temp;
  }

  static void maxHeapify(int[] arr,int n,int i){
    int largest=i,left = (2*i)+1,right = (2*i)+2;
    if(left<n && arr[largest]<arr[left]){
      largest = left;
    }
    if(right<n && arr[largest]<arr[right]){
      largest = right;
    }
    if(largest!=i){
      swap(arr,i,largest);
      maxHeapify(arr, n, largest);
    }
  }

  static void buildHeap(int[] arr,int n){
    for(int i=(n-2)/2;i>=0;i--){
      maxHeapify(arr, n, i);
    }
  }

    static void heapSort(int arr[], int n)
    {
      buildHeap(arr, n);
      for(int i=n-1;i>=0;i--){
        swap(arr, 0, i);
        maxHeapify(arr, i, 0);
      }
    }

    static int partition(int arr[], int low, int high)
    {
      int pivot = arr[low];
      int i=low-1,j=high+1;
      while(true){
          do{
             i++;
          }while(arr[i]<pivot);
          do{
              j--;
          }while(arr[j]>pivot);
          if(i>=j){
              return j;
          }
          swap(arr,i,j);
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
      heapSort(array,size);
      System.out.println("After sorting");
      for(int i=0;i<size;i++){
        System.out.print(array[i]+" ");
      }
      System.out.println();
    }
}
