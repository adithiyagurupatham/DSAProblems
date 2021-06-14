/**
Program to reverse the array
*/
import java.io.*;
public class ArrayReversal{
  static void reverseArray(int[] array){
    int left=0,right=array.length-1;
    while(right>left){
      int temp = array[left];
      array[left] = array[right];
      array[right] = temp;
      left++;
      right--;
    }
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    reverseArray(array);
    System.out.println("After the array reversal");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
