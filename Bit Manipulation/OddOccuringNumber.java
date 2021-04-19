import java.io.*;
public class OddOccuringNumber{
  static int getOddOccuring(int[] array){
    int oddOccuringNumber=0;
    for(int each : array){
      oddOccuringNumber = oddOccuringNumber ^ each;
    }
    return oddOccuringNumber;
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
    System.out.println("The odd occuring number is "+getOddOccuring(array));
  }
}
