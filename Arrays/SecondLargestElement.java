/**
Program to find the second largest element index
*/
import java.io.*;
public class SecondLargestElement{

  static int getSecondLargest(int[] array){
    int max=0,secondMax =-1;
    for(int i=1;i<array.length;i++){
      if(array[i]>array[max]){
        secondMax=max;
        max=i;
      }
      else if((array[i]!=array[max]) && (secondMax==-1 || array[i]>array[secondMax])){
        secondMax=i;
      }
    }
    return secondMax;
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
    System.out.println("The second largest element index is "+getSecondLargest(array));
  }
}
