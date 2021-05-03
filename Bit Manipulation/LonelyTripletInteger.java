/**
 Program to find the lonely integer in an array where every other element occurs in triplet
 Link : https://leetcode.com/problems/single-number-ii/
*/
import java.io.*;
public class LonelyTripletInteger{
  static int getLonelyElement(int[] array){
    int answer=0;
        for(int i=31;i>=0;i--){
            int count=0;
            for(int each : array){
                if((each & (1<<i)) !=0){
                    count++;
                }
            }
                answer = answer | ((count%3)<<i);
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
    System.out.println("The lonely element is "+getLonelyElement(array));
  }
}
