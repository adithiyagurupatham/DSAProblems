/*
To find two odd occuring elements of the given array
Link : https://www.geeksforgeeks.org/find-the-two-numbers-with-odd-occurences-in-an-unsorted-array/
*/
import java.io.*;
public class TwoOddOccuringNumber{

  static void getTwoOddOccuringNumbers(int[] array){
    int answer=0;
    for(int each : array){
      answer^=each;
    }
    int rightSetBit = answer & (~(answer-1));
    int first=0,second=0;
    for(int each : array){
      if((each&rightSetBit)>0){
        first^=each;
      }
      else{
        second^=each;
      }
    }
    System.out.println("The two odd occuring numbers are "+first+" and "+second);
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
    getTwoOddOccuringNumbers(array);
  }

}
