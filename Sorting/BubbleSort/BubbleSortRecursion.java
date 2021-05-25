/**
Sort the array using bubble sort
Time Complexity : Best Case : O(n)
                  Avg Case  : O(n^2)
                  Worst Case: O(n^2)
*/
import java.io.*;
public class BubbleSortRecursion{
  static void sort(int[] array,int n){
    if(n==1){
      return;
    }
    for(int i=0;i<n-1;i++){
      if(array[i]>array[i+1]){
        int temp = array[i];
        array[i] = array[i+1];
        array[i+1]=temp;
      }
    }
    sort(array,n-1);
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
    sort(array,array.length);
    System.out.println("After the sorting ");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
