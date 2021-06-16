/**
Program to rotate array right by d places
Time Complexity : O(n)
Space Complexity : O(d)
*/
import java.io.*;
public class RightRotateOptimal{
  static void rotateByRight(int[] array,int d){
    if(d==0){
      return;
    }
    int n = array.length;
    int[] temp = new int[d];
    for(int i=0;i<d;i++){
      temp[i]=array[n-1-i];
    }
    for(int i=n-1-d;i>=0;i--){
      array[i+d]=array[i];
    }
    for(int i=0;i<d;i++){
      array[i]=temp[d-i-1];
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
    System.out.println("Enter the value of d");
    Integer d = Integer.valueOf(br.readLine());
    d=d%number;
    rotateByRight(array,d);
    System.out.println("After rotating the updated array is ");
    for(int i=0;i<number;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
