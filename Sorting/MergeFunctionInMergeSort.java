/**
Program to implement the merge function of the merge sort
Time Complexity : O(n)
Space Complexity : O(n)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MergeFunctionInMergeSort{

  static void merge(int[] array,int low,int mid,int high){
    int[] left = new int[mid-low+1];
    int[] right = new int[high-mid];
    int i=0,j=0;
    for(;i<left.length;i++){
      left[i] = array[low+i];
    }
    for(;j<right.length;j++){
      right[j] = array[mid+1+j];
    }
    i=0;j=0;
    int k=0;
    while(i<left.length && j<right.length){
      if(left[i]<=right[j]){
        array[k] = left[i];
        i++;
        k++;
      }
      else{
        array[k] = right[j];
        j++;
        k++;
      }
    }
    while(i<left.length){
      array[k] = left[i];
      i++;
      k++;
    }
    while(j<right.length){
      array[k] = right[j];
      j++;
      k++;
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
    System.out.println("Enter the value of low");
    Integer low = Integer.valueOf(br.readLine());
    System.out.println("Enter the value of mid");
    Integer mid = Integer.valueOf(br.readLine());
    System.out.println("Enter the value of high");
    Integer high = Integer.valueOf(br.readLine());
    merge(array, low, mid, high);
    System.out.println("After the merging ");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
