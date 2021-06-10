/**
Program to find the largest element index
*/
import java.io.*;
public class LargestElement{
  static int getLargestIndex(int[] array){
    int length = array.length;
    int max =0;
    for(int i=0;i<length;i++){
      if(array[i]>array[max]){
        max=i;
      }
    }
    return max;
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The maximum element index is "+getLargestIndex(array));
  }
}
