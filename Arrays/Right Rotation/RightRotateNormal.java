/**
Program to rotate array right by d places
Time Complexity : O(n*d)
Space Complexity : O(1)
*/
import java.io.*;
public class RightRotateNormal{
  static void rotateByRight(int[] array){
    int temp = array[array.length-1];
    for(int i=array.length-1;i>=1;i--){
      array[i]=array[i-1];
    }
    array[0]=temp;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("Enter the value of d");
    Integer d = Integer.valueOf(br.readLine());
    d=d%number;
    for(int i=0;i<d;i++){
      rotateByRight(array);
    }
    System.out.println("After rotating the updated array is ");
    for(int i=0;i<number;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
