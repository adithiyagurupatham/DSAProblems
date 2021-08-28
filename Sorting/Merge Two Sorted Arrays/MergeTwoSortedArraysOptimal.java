/**
Program to merge two sorted arrays
Time Complexity : (m+n)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MergeTwoSortedArraysOptimal{

  static void mergeTwoArrays(int[] array,int[] array1){
    int i=0,j=0;
    while(i<array.length && j<array1.length){
      if(array[i]<=array1[j]){
        System.out.print(array[i]+" ");
        i++;
      }
      else{
        System.out.print(array1[j]+" ");
        j++;
      }
    }
    while(i<array.length){
      System.out.print(array[i]+" ");
      i++;
    }
    while(j<array1.length){
      System.out.print(array1[j]+" ");
      j++;
    }
    System.out.println();
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
    System.out.println("Enter the second array input size");
    Integer size1 = Integer.valueOf(br.readLine());
    int[] array1 = new int[size1];
    System.out.println("Enter the elements");
    inputString = br.readLine().split(" ");
    for(int i=0;i<size1;i++){
      array1[i] = Integer.valueOf(inputString[i]);
    }
    mergeTwoArrays(array, array1);
  }
}
