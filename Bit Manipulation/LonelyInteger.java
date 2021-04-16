/**
Lonely Integer is the only integer of the array which has a frequency of 1
*/
import java.util.*;
import java.io.*;
public class LonelyInteger{
  static int getLonelyInteger(int[] array) {
        int lonelyInteger=0;
        for(int i=0;i<array.length;i++){
           lonelyInteger = lonelyInteger^array[i];
        }
        return lonelyInteger;

    }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    System.out.println("Enter the elements");
    String[] input = br.readLine().split(" ");
    int[] array = new int[number];
    for(int i=0;i<number;i++){
      array[i] = Integer.valueOf(input[i]);
    }
    System.out.println("The lonely integer is "+getLonelyInteger(array));
  }

}
