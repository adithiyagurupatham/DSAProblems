/*
  Program to find the duplicate in the list of 1 to n-1
*/
import java .io.*;
public class FindDuplicate{

  static int findDuplicate(int [] array){
    int answer=0;
    for(int each : array){
      answer^=each;
    }
    for(int i=1;i<=(array.length-1);i++){
      answer^=i;
    }
    return answer;
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
    System.out.println("The answer is "+findDuplicate(array));
  }
}
