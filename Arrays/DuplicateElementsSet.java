/**
Find the duplicate element in the array of integers in the range [1,n]
Link : https://leetcode.com/problems/find-the-duplicate-number/
Space Complexity : O(N)
Time Complexity : O(N)
*/
import java.io.*;
import java.util.*;
public class DuplicateElementsSet{
  static int getDuplicate(int[] nums){
    Set<Integer> set = new HashSet<>();
        for(int each : nums){
            if(set.contains(each)){
                return each;
            }
            set.add(each);
        }
        return -1;
  }

  public static void main(String[] args)  throws IOException{
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
