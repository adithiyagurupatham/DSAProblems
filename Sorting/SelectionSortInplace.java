/**
Sort the array using in place selection sort algorithm
Time Complexity : O(n*n)
Space Complexity : O(1)
*/
import java.io.*;
public class SelectionSortInplace{

  static void sort(int[] array){
    for(int i=0;i<array.length-1;i++){
      int minIndex=i;
      for(int j=i;j<array.length;j++){
        if(array[j]<array[minIndex]){
          minIndex=j;
        }
      }
      int temp=array[i];
      array[i]=array[minIndex];
      array[minIndex]=temp;
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
