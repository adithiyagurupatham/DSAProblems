/**
Program to perform insertion sort
Time Complexity : Best Case : O(n)
                  Avg Case  : O(n^2)
                  Worst Case: O(n^2)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class InsertionSort{
  static void sort(int arr[], int n)
  {
      for(int i=1;i<n;i++){
          int key = arr[i],j=i-1;
          while(j>=0 && arr[j]>key){
              arr[j+1] = arr[j];
              j--;
          }
          arr[j+1] = key;
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
    sort(array,size);
    System.out.println("After the sorting ");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
