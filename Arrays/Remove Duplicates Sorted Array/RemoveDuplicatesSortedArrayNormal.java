/**
Program to remove duplicates from sorted array
Time Complexity : O(n)
Space Complexity : O(n)
*/
import java.io.*;
public class RemoveDuplicatesSortedArrayNormal{

  static int removeDuplicates(int[] array){
    int[] temp = new int[array.length];
    int res=0;
    temp[res]=array[res];
    for(int i=1;i<array.length;i++){
      if(temp[res]!=array[i]){
        temp[++res]=array[i];
      }
    }
    for(int i=0;i<array.length;i++){
      array[i]=temp[i];
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
