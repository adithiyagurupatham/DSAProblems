/**
Program to rotate array left by d places
Time Complexity : O(n)
Space Complexity : O(n)
*/
import java.io.*;
public class LeftRotateOptimal{
  static void rotateByLeft(int[] array,int d){
    if(d==0){
      return;
    }
    int[] temp = new int[array.length];
    int i=0;
    for(int ptr=d;ptr<array.length;ptr++){
      temp[i++]=array[ptr];
    }
    for(int ptr=0;ptr<d;ptr++){
      temp[i++]=array[ptr];
    }
    for(i=0;i<array.length;i++){
      array[i]=temp[i];
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
    rotateByLeft(array,d);
    System.out.println("After rotating the updated array is ");
    for(int i=0;i<number;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
