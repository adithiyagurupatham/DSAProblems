/**
Program to segregate 0,1,2
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class DutchFlagAlgorithm{
  static void swap(int[] arr,int src,int dest){
        int temp = arr[src];
        arr[src] = arr[dest];
        arr[dest] = temp;
    }

  static void segregate(int arr[], int N)
    {
      int low=0,mid=0,high=N-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,high,mid);
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
    segregate(array, size);
    System.out.println("After segregation "+Arrays.toString(array));
  }
}
