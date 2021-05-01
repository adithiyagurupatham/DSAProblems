/*
Generate the power set (subset) of the given array
*/
import java.io.*;
public class PowerSet{
  static void printPowerSet(int[] array){
    for(int i=0;i<1<<array.length;i++){
      for(int j=0;j<array.length;j++){
        if((i&(1<<j))!=0){
          System.out.print(array[j]);
        }
      }
      System.out.println();
    }
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the size of array");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputArray = br.readLine().split(" ");
    for(int i=0;i<inputArray.length;i++){
      array[i] = Integer.valueOf(inputArray[i]);
    }
    System.out.println("The power set of the given array are ");
    printPowerSet(array);
  }
}
