/**
Program to find duplicates within range 1 to n-1 (using indices)
*/
import java.io.*;
public class FindDuplicates{

  static int findDuplicate(int[] array){
    int duplicate =-1;
    for(int value : array){
      value = (value<0)?-value:value; // to handle negative index case
      if(array[value-1]>=0){
        array[value-1]= -array[value-1];
      }
      else{
        duplicate=value;
        break;
      }
    }
    return duplicate;
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
    System.out.println("The duplicate element is "+findDuplicate(array));
  }

}
