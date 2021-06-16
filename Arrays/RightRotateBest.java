/**
Program to rotate array left by d places
Time Complexity : O(n)
Space Complexity : O(1)
*/
import java.io.*;
public class RightRotateBest{

  static void reverse(int[] array,int source,int destination){
    int low = source,high=destination;
    while(low<high){
      swap(array,low,high);
      low++;
      high--;
    }
  }
  static void swap(int[] array,int source,int destination){
    int temp = array[source];
    array[source] = array[destination];
    array[destination] = temp;
  }

  static void rotateByRight(int[] array,int d){
    if(d==0){
      return;
    }
    int n = array.length;
    reverse(array,n-d,n-1);
    reverse(array,0,n-d-1);
    reverse(array,0,n-1);
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
