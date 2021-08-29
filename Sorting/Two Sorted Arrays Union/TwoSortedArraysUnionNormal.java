/**
Program to print the union of two sorted arrays
Time Complexity : (m+n log(m+n))
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class TwoSortedArraysUnionNormal{

  static void printUnion(int[] array,int[] array1){
    int[] temp = new int[array.length + array1.length];
    for(int i=0;i<array.length;i++){
      temp[i] = array[i];
    }
    for(int i=0;i<array1.length;i++){
      temp[array.length+i] = array1[i];
    }
    Arrays.sort(temp);
    for(int i=0;i<temp.length;i++){
      if(i==0 || temp[i]!=temp[i-1]){
        System.out.print(temp[i]+" ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the first array input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the second array input size");
    Integer size1 = Integer.valueOf(br.readLine());
    int[] array1 = new int[size1];
    System.out.println("Enter the elements");
    inputString = br.readLine().split(" ");
    for(int i=0;i<size1;i++){
      array1[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The union of two sorted arrays are ");
    printUnion(array, array1);
  }
}
