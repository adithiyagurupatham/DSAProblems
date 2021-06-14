/**
Program to remove duplicates from sorted array
Time Complexity : O(n)
Space Complexity : O(1)
*/
import java.io.*;
public class RemoveDuplicatesSortedArrayOptimal{

  static int removeDuplicates(int[] array){
    int[] temp = new int[array.length];
    int res=0;
    for(int i=1;i<array.length;i++){
      if(array[res]!=array[i]){
        array[++res]=array[i];
      }
    }
    return res+1;
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
    int res =  removeDuplicates(array);
    System.out.println("The non duplicate entries  are ");
    for(int i=0;i<res;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
