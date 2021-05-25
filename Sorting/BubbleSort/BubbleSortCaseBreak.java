/**
Sort the array using bubble sort
Time Complexity : Best Case : O(n)
                  Avg Case  : O(n^2)
                  Worst Case: O(n^2)
*/
import java.io.*;
public class BubbleSortCaseBreak{
  static void sort(int[] array){
    int n = array.length;
    boolean isSorted = true;
    for(int i=0;i<n-1;i++){
      isSorted=true;
      for(int j=0;j<(n-i-1);j++)
      {
          if(array[j]>array[j+1]){
            int temp = array[j];
            array[j]=array[j+1];
            array[j+1]=temp;
            isSorted=false;
          }
      }
      if(isSorted){
        break;
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
    sort(array);
    System.out.println("After the sorting ");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
