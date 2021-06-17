/**
Find the duplicate element in the array of integers in the range [1,n]
LInk : https://leetcode.com/problems/find-the-duplicate-number/
Space Complexity : O(n)
Time Complexity : O(n)
*/

import java.io.*;
public class DuplicateElementsBasic{
  static int getDuplicate(int[] array){
    int[] temp = new int[array.length+1];
    for(int each : array){
      temp[each] = temp[each]+1;
      if(temp[each]>1){
        return each;
      }
    }
    return -1;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The duplicate element is "+getDuplicate(array));

  }
}
