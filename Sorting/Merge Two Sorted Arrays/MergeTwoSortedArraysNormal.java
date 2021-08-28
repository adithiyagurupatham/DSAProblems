/**
Program to merge two sorted arrays
Time Complexity : (m+n)log(m+n)
Space Complexity : O(m+n)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MergeTwoSortedArraysNormal{

  static void mergeTwoArrays(int[] array,int[] array1){
    int totalLength = array.length+array1.length;
    int[] temp = new int[totalLength];
    int i=0;
    for(;i<array.length;i++){
      temp[i]=array[i];
    }
    for(int j=0;j<array1.length;j++,i++){
      temp[i] = array1[j];
    }
    Arrays.sort(temp);
    System.out.println("After the merging ");
    for(i=0;i<temp.length;i++){
      System.out.print(temp[i]+" ");
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
