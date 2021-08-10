/**
Program to find the median of the two sorted arrays
Time Complexity : O(M log M)
Space Complexity : O(M)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MedianOfTwoSortedArraysNormal{
  static float getMedian(int[] array1,int[] array2){
    int maxSize = array1.length+array2.length,i=0;
    int[] temp = new int[maxSize];
    for(;i<array1.length;i++){
      temp[i]=array1[i];
    }
    for(int j=0;j<array2.length;j++,i++){
      temp[i] = array2[j];
    }
    Arrays.sort(temp);
    if(maxSize%2==1){
      return temp[maxSize/2];
    }
    return (float)(temp[maxSize/2] + temp[(maxSize-1)/2])/2;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the fir input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the second array input size");
    Integer secondSize = Integer.valueOf(br.readLine());
    int[] array2 = new int[secondSize];
    System.out.println("Enter the elements");
    String[] inputString2 = br.readLine().split(" ");
    for(int i=0;i<secondSize;i++){
      array2[i] = Integer.valueOf(inputString2[i]);
    }
    System.out.println("The median of the two array is "+getMedian(array,array2));
  }
}
